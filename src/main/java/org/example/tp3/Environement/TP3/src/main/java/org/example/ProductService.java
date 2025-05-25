package org.example.tp3.Environement.TP3.src.main.java.org.example;

public class ProductService {

    private final ProductApiClient pac;
    public ProductService(ProductApiClient pac){
        this.pac = pac;
    }

    public Product getProduct(String productId) throws IncompatibleDataFormatException, ApiCallFaillureException {
       return  pac.getProduct(productId);
    }
}
