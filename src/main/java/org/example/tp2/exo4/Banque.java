package org.example.tp2.exo4;

public class Banque {
    public int getFond() {
        return fond;
    }

    public void setFond(int fond) {
        this.fond = fond;
    }

    public int getFondMinimum() {
        return fondMinimum;
    }

    private int fond;
    private final int fondMinimum;

    public Banque(int fondInitial, int fondMinimum) {
        this.fond = fondInitial;
        this.fondMinimum = fondMinimum;
    }

    public void crediter(int somme) {
        fond += somme;
    }

    public void debiter(int somme) {
        fond -= somme;
    }

    public boolean est_solvable() {
        return fond >= fondMinimum;
    }
}