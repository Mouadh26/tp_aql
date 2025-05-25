Exo1:
On a deux classe:
-> UserService: qui recuppere un objet utilsiateur en utilsiant son ID,
-> User: c'est la classe qui defini l'utilisateur avec id et nom simplement, pour pouvoir faire la simulaiton apres
on a aussi une interface:
-> UserRepository: qui contient une seule methode findUserById, qui serra apl par la classe UserService pour recupere l'utilisateur.
-Dans cette exercice on veut verifier la methode de l'interface, pour cella on a:  
  1- on definis l'utilisateur (avec son id et nom)
  2- on definis le comportement du mock
  3- on defiri le resultat qui est supposé etre
  4- on fait les verification 
-------------------------------------------------------------------------------------
Exo2:
On a deux classe:
-> OrderController: fait la creation de createrOrder en appellant une autre orderService.createOrder(oder),
-> orderService: fait l'enregistrement de createrOrder en appellant une autre orderDao.saveOrder(oder)
on a aussi une interface:
-> orderDao: qui rend un boolean si l'enregistrement a ete execute ou pas.
--------------------------------------------------------------------------------------
Exo3:
on a deux classes: 
-> ProductService : contient une methode pour recupere un objet produit par son id
-> Product: le produit en auestion definit par id et nom;
une interface: 
-> ProductApiClient: pour aider a recupere les info du produit
-Pour la classe de test: on cree alors un mock de l'interface pour simuler sla recuperation des data, on definis le produit avec lequel on ferra les tests.
On identifie trois cas de figure: 
1- Recupperation Reussite: 
    1- on defini le comportement du mock en premier lieu, 
    2- on init le productService avec le mock 
    3- on fait le call de la methode et on stock le resultat
    4- on verifie que la methode a ete appelé par les bons argument et nôn verifie par la meme occasion si le resultat est faux ou vrai (dans le code, il y a resultat pour un test reussi et un resultat2 ajouter pour un test negatif)
2-Argument incompatible: 
    1-on init l'id et le productService avec le mock
    2- on definit le comportement du mock pour qu'il leve un exception lors de l'apl avec cet argument
    3- on verifie tout cela apres comme ecrit 
3- echec de l'appel API: de la meme maniere que le cas precedent
    1-on init l'id et le productService avec le mock
    2- on definit le comportement du mock pour qu'il leve un exception lors de l'apl pour le faillure du call
    3- on verifie tout cela apres comme ecrit 

--------------------------------------------------------------------------------------------------------------------
*to be continued....*
