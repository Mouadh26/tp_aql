package org.example.tp3.Environement.TP3.src.main.java.org.example;

public interface ProductApiClient {
   Product getProduct(String productId) throws IncompatibleDataFormatException, ApiCallFaillureException;
}
