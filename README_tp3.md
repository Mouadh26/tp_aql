Exo 1 : UserService
Contexte
Classes :

UserService : Permet de récupérer un objet User en utilisant son id.

User : Représente un utilisateur, défini simplement par un id et un nom (utile pour la simulation).

Interface :

UserRepository : Contient une seule méthode findUserById(id), appelée par UserService pour récupérer l'utilisateur.

Objectif du test
Dans cet exercice, nous voulons vérifier le fonctionnement de la méthode de l'interface. Pour cela :

On définit un utilisateur (avec son id et son nom).

On configure le comportement du mock.

On définit le résultat attendu (valeur supposée).

On effectue les vérifications.

Exo 2 : OrderController
Contexte
Classes :

OrderController : Gère la création d'une commande via createOrder(), en appelant OrderService.createOrder(order).

OrderService : Effectue l'enregistrement de la commande via OrderDao.saveOrder(order).

Interface :

OrderDao : Fournit un booléen indiquant si l'enregistrement a été effectué ou non.

Exo 3 : ProductService
Contexte
Classes :

ProductService : Contient une méthode permettant de récupérer un objet Product à partir de son id.

Product : Représente un produit défini par un id et un nom.

Interface :

ProductApiClient : Sert à récupérer les informations d'un produit.

Objectif du test
Dans la classe de test, nous allons :

Définir le produit avec ses attributs (id, nom).

Simuler le comportement du mock de ProductApiClient.

Définir le résultat attendu.

Effectuer les vérifications.
