package org.example.tp3.Exo3;
public interface ProductApiClient {
   Product getProduct(String productId) throws IncompatibleDataFormatException, ApiCallFaillureException;
}
