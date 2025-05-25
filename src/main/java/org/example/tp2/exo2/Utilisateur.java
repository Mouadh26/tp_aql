package org.example.tp2.exo2;

public class Utilisateur {
    private String prenom;
    private String nom;
    private String email;
    private int id; // Identifiant généré par l'API après création

    // Constructeur pour initialiser un utilisateur
    public Utilisateur(String prenom, String nom, String email) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
    }

    // Getters
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    // Setter pour l'ID (assigné par l'API après création)
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}