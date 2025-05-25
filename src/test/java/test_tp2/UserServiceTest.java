package test_tp2;

import org.example.tp2.exo2.ServiceException;
import org.example.tp2.exo2.UserService;
import org.example.tp2.exo2.Utilisateur;
import org.example.tp2.exo2.UtilisateurApi;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UtilisateurApi utilisateurApiMock;

    @Test
    public void testCreerUtilisateur() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // ✅ Configuration du comportement du mock (ici, on ne lève pas d'exception)
        doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // ✅ Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // ✅ Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);

        // ✅ Vérification de l'appel à l'API
        verify(utilisateurApiMock).creerUtilisateur(utilisateur);
        verifyNoMoreInteractions(utilisateurApiMock); // bonne pratique
    }
}
