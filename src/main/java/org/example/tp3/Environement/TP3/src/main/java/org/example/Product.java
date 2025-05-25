package org.example.tp3.Environement.TP3.src.main.java.org.example;

public class Product {
    private String Id;
    private String Name;

    // Constructeur
    public Product(String Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    // Getters et Setters
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

}
