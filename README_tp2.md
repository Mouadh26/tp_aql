# README

## Exceptions(manquantes) Ajoutées 

Pour améliorer la robustesse du code et gérer les cas d'erreur, nous avons ajouté les exceptions suivantes :

---


### **1. UserService**
- **Exception : `ServiceException`**
    - **Raison** : Si les données de l'utilisateur sont incompletes
    - **Cas d'utilisation** : Appel de `creerUtilisateur(utilisateur)` avec des données incorrectes.

---

### **2. Jeu de Dés**
- **Exceptions :**
    - **`DebitImpossibleException`**
        - **Raison** : Cette exception est levée lorsqu'un joueur tente de se débiter une somme qu'il ne peut pas payer (insolvabilité)
        - **Cas d'utilisation** : Appel de `jouer(joueur, de1, de2)` avec une mise invalide.
    - **`JeuFermeException`**
        - **Raison** : Cette exception est levée lorsque le jeu est fermé et que l'utilisateur tente d'effectuer une action qui n'est plus autorisée.
        - **Cas d'utilisation** : Après un gain qui vide la banque.

---
## Corrections :
- **Exo1 (Calculatrice)** :

La classe Calculatrice ne possédait pas de méthode getResult() (ou getState()) pour permettre un test d’état.

Le test de la méthode additionner utilisait un mock, ce qui empêche de vérifier l’état réel de l’objet sans stubbing supplémentaire.

Le test vérifiait l'appel à getResult() sans jamais appeler la méthode.
- **Exo2 (UserService)** :
utiliser les proprities de junit5
- **Exo3 (UserServiceScenariosTest)** :
- **Exo4 (Jeu)** : Gestion des cas où le jeu est fermé ou le joueur est insolvable
---
## Réponses aux questions :

1. Quels objets dont dépend la classe Jeu sont forcément mockés dans un test pour automatiser jouer ? Pourquoi ?
   Dans le cadre d'un test unitaire isolé pour la méthode jouer, les dépendances suivantes doivent être mockées :

Banque : La classe Jeu interagit avec la banque pour créditer/débiter des sommes et vérifier sa solvabilité.

Joueur : La classe Jeu interagit avec le joueur pour récupérer sa mise, le débiter ou le créditer.

De (les deux dés) : Les dés sont utilisés pour générer des lancers aléatoires.

Raison :
Ces objets (Banque, Joueur, De) sont des dépendances externes à la classe Jeu. Pour tester Jeu en isolation, il est nécessaire de simuler leur comportement avec des mocks afin de contrôler précisément les interactions et les résultats renvoyés.

2. Scénarios (classes d’équivalence) pour tester `jouer `:
- Cas où le jeu est fermé :
Le jeu est fermé avant d'appeler jouer.
Une exception JeuFermeException doit être levée.
- Cas où le joueur est insolvable :
Le joueur n'a pas assez de fonds pour effectuer une mise.
La méthode debiter(int somme) du joueur doit lever une exception DebitImpossibleException.
- Cas où la somme des dés ne vaut pas 7 :
Les dés retournent une somme différente de 7.
Le joueur perd sa mise, et la banque conserve les fonds.
- Cas où la somme des dés vaut 7 et la banque est solvable :
Les dés retournent une somme de 7.
Le joueur gagne deux fois sa mise, et la banque débite cette somme.
- Cas où la somme des dés vaut 7 et la banque n'est plus solvable :
Les dés retournent une somme de 7.
La banque paie le gain au joueur mais devient insolvable, et le jeu ferme.
- Cas où la banque est initialement non solvable :
La banque n'est pas solvable dès le début.
Le jeu doit immédiatement fermer.

4. Test le plus simple : Cas où le jeu est fermé

   Type de test : C'est un test d'état , car il vérifie si le jeu est fermé en examinant son état après avoir appelé fermer().


5. Tester le cas où le joueur est insolvable :

- Comment tester que le jeu ne touche pas aux dés ?
   Pour vérifier que les dés ne sont pas touchés lorsque le joueur est insolvable, utilisez verify(de1Mock, never()).lancer() et verify(de2Mock, never()).lancer().

- Type de test :
C'est un test d'interaction , car il vérifie que les méthodes des dés ne sont jamais appelées.

