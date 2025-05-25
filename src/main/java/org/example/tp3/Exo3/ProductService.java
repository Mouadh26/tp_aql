package org.example.tp3.Exo3;
public class ProductService {

    private final ProductApiClient pac;
    public ProductService(ProductApiClient pac){
        this.pac = pac;
    }

    public Product getProduct(String productId) throws IncompatibleDataFormatException, ApiCallFaillureException {
       return  pac.getProduct(productId);
    }
}
