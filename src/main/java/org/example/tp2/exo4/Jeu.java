package org.example.tp2.exo4;

public class Jeu {
    private final Banque banque;
    private boolean ouvert;

    public Jeu(Banque banque) {
        this.banque = banque;
        this.ouvert = true;
    }

    public void jouer(Joueur joueur, De de1, De de2) throws JeuFermeException {
        if (!ouvert) throw new JeuFermeException("Le jeu est fermé");

        int mise = joueur.mise();
        try {
            joueur.debiter(mise);
        } catch (DebitImpossibleException e) {
            return;
        }
        banque.crediter(mise);

        int sommeDes = de1.lancer() + de2.lancer();
        if (sommeDes == 7) {
            int gain = mise * 2;
            if (banque.est_solvable()) {
                joueur.crediter(gain);
                banque.debiter(gain);
                if (!banque.est_solvable()) {
                    fermer();
                }
            } else {
                fermer();
            }
        }
    }

    public void fermer() {
        ouvert = false;
    }

    public boolean estOuvert() {
        return ouvert;
    }
}