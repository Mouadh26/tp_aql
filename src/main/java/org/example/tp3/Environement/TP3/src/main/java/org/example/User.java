package org.example.tp3.Environement.TP3.src.main.java.org.example;

public class User {
    private long id;
    private String name;
    public User(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
