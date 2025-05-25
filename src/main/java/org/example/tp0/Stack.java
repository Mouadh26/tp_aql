package org.example.tp0;

public class Stack {
    private int[] array;
    private int top;
    private static final int INITIAL_CAPACITY = 10;

    public Stack() {
        array = new int[INITIAL_CAPACITY];
        top = -1; // Initialisation de top à -1 pour indiquer une pile vide
    }

    public void push(int element) {
        if (top == array.length - 1) {
            expandArray();
        }
        array[++top] = element; // Incrémente top avant d'ajouter l'élément
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty"); // Lève une exception si la pile est vide
        }
        return array[top--]; // Décrémente top après avoir retourné l'élément
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty"); // Lève une exception si la pile est vide
        }
        return array[top]; // Retourne l'élément au sommet sans modifier top
    }

    public boolean isEmpty() {
        return top == -1; // Vérifie si la pile est vide
    }

    public int size() {
        return top + 1; // Retourne le nombre d'éléments dans la pile
    }

    private void expandArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray; // Remplace l'ancien tableau par le nouveau tableau agrandi
    }
}