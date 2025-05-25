Exceptions ajoutées
Afin d'améliorer la robustesse du code et de gérer les cas d'erreur, nous avons ajouté les exceptions suivantes :

1. UserService
Exception : ServiceException

Raison : Levée lorsque les données de l'utilisateur sont incomplètes.

Cas d'utilisation : Appel de creerUtilisateur(utilisateur) avec des données incomplètes ou invalides.

2. Jeu de Dés
Exceptions :

DebitImpossibleException

Raison : Levée lorsqu'un joueur tente de se débiter d'une somme qu'il ne peut pas payer (insolvabilité).

Cas d'utilisation : Appel de jouer(joueur, de1, de2) avec une mise invalide.

JeuFermeException

Raison : Levée lorsque le jeu est fermé et qu'un utilisateur tente d'effectuer une action non autorisée.

Cas d'utilisation : Tentative de jeu après un gain ayant vidé la banque.

Corrections
Exo1 (Calculatrice)
La classe Calculatrice ne possédait pas de méthode getResult() (ou getState()) permettant de vérifier l’état de l’objet lors des tests.

Le test de la méthode additionner utilisait un mock, ce qui empêchait de vérifier l’état réel de l’objet sans un stubbing supplémentaire.

Correction : ajout d’une méthode d’accès à l’état et ajustement des tests en conséquence.
