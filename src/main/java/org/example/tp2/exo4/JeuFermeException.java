package org.example.tp2.exo4;

public class JeuFermeException extends Exception {
  public JeuFermeException(String message) {
    super(message);
  }

  public JeuFermeException(String message, Throwable cause) {
    super(message, cause);
  }
}