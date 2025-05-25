package test_tp2;

import org.example.tp2.exo4.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class JeuTest {
    @Mock
    private Banque banqueMock;

    @Mock
    private Joueur joueurMock;

    @Mock
    private De de1Mock, de2Mock;
    @InjectMocks
    private Jeu jeu;

    @Test
    void test_JeuFerme() {
        // Arrange
        Jeu jeu = new Jeu(banqueMock);
        jeu.fermer();

        // Act & Assert
        assertThrows(JeuFermeException.class, () -> jeu.jouer(joueurMock, de1Mock, de2Mock));
    }


    @Test
    public void testJoueurInsolvableNeLancePasLesDes() throws DebitImpossibleException, JeuFermeException {
        Banque banque = mock(Banque.class);
        Jeu jeu = new Jeu(banque);

        Joueur joueur = mock(Joueur.class);
        De de1 = mock(De.class);
        De de2 = mock(De.class);

        when(joueur.mise()).thenReturn(100);
        doThrow(new DebitImpossibleException("JoueurInsolvableNeLancePasLesDes")).when(joueur).debiter(100);

        jeu.jouer(joueur, de1, de2);

        // Vérifier que les dés n'ont jamais été lancés
        verifyNoInteractions(de1);
        verifyNoInteractions(de2);

        // Vérifier que la banque n'est pas appelée
        verifyNoInteractions(banque);
    }
    @Test
    void test_SommeDesEgale7_BanqueSolvable() throws DebitImpossibleException, JeuFermeException {
        // Mocks
        Joueur joueur = mock(Joueur.class);
        De de1 = mock(De.class);
        De de2 = mock(De.class);
        Banque banque = mock(Banque.class);

        // Configurations
        when(joueur.mise()).thenReturn(10);
        doNothing().when(joueur).debiter(10);
        when(de1.lancer()).thenReturn(3);
        when(de2.lancer()).thenReturn(4); // Somme = 7
        when(banque.est_solvable()).thenReturn(true); // Appelé 2 fois, donc toujours true

        // Jeu
        Jeu jeu = new Jeu(banque);
        jeu.jouer(joueur, de1, de2);

        // Vérifications des interactions
        verify(joueur).mise();
        verify(joueur).debiter(10);
        verify(de1).lancer();
        verify(de2).lancer();
        verify(banque).crediter(10); // La banque reçoit la mise
        verify(joueur).crediter(20); // Le joueur gagne deux fois la mise
        verify(banque).debiter(20);  // La banque paie les gains

        // Appelé 2 fois : avant et après le gain
        verify(banque, times(2)).est_solvable();

        // Le jeu doit rester ouvert
        assertTrue(jeu.estOuvert());
    }

    @Test
    void test_SommeDesEgale7_BanqueNonSolvable() throws DebitImpossibleException, JeuFermeException {
        // Mocks
        Joueur joueur = mock(Joueur.class);
        De de1 = mock(De.class);
        De de2 = mock(De.class);
        Banque banque = mock(Banque.class);

        // Configurations
        when(joueur.mise()).thenReturn(10);
        doNothing().when(joueur).debiter(10);
        when(de1.lancer()).thenReturn(6);
        when(de2.lancer()).thenReturn(1); // Somme = 7

        // La banque est solvable avant, mais ne l'est plus après avoir payé
        when(banque.est_solvable()).thenReturn(true).thenReturn(false); // 1er appel -> true, 2e -> false

        // Jeu
        Jeu jeu = new Jeu(banque);
        jeu.jouer(joueur, de1, de2);

        // Vérifications des interactions
        verify(joueur).mise();
        verify(joueur).debiter(10);
        verify(de1).lancer();
        verify(de2).lancer();
        verify(banque).crediter(10);     // Banque reçoit la mise
        verify(banque).debiter(20);      // Banque paie les gains
        verify(joueur).crediter(20);     // Joueur gagne

        // Vérifie que est_solvable est bien appelé deux fois
        verify(banque, times(2)).est_solvable();

        // Vérifie que le jeu est bien fermé après le gain
        assertFalse(jeu.estOuvert());
    }

    @Test
    void test_BanqueReelle_NonSolvableApresGain() throws DebitImpossibleException, JeuFermeException {
        // Banque avec 25 de fond et un seuil de solvabilité de 20
        Banque banque = new Banque(25, 20);

        // Mocks
        Joueur joueur = mock(Joueur.class);
        De de1 = mock(De.class);
        De de2 = mock(De.class);

        // Configurations du mock
        when(joueur.mise()).thenReturn(10);
        doNothing().when(joueur).debiter(10);
        when(de1.lancer()).thenReturn(3);
        when(de2.lancer()).thenReturn(4); // Somme = 7

        Jeu jeu = new Jeu(banque);

        // Action
        jeu.jouer(joueur, de1, de2);

        // La banque passe de 25 → +10 (mise) → 35 → -20 (gain) = 15
        // Or 15 < 20 ⇒ insolvabilité ⇒ jeu fermé

        assertEquals(15, banque.getFond());   //  fond final attendu
        assertFalse(jeu.estOuvert());         //  jeu doit être fermé

        // Vérification du paiement du gain
        verify(joueur).crediter(20);
    }





}