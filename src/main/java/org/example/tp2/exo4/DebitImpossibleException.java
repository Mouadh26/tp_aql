package org.example.tp2.exo4;

public class DebitImpossibleException extends Exception {
  public DebitImpossibleException(String message) {
    super(message);
  }

  public DebitImpossibleException(String message, Throwable cause) {
    super(message, cause);
  }
}
