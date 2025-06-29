package org.example.tp0;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName; // Correction : ajout d'un espace
    }

    public boolean isAdult() {
        return age >= 18;
    }
}