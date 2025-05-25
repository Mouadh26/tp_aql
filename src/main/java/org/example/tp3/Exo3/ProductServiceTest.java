package org.example.tp3.Exo3;
import org.example.IncompatibleDataFormatException;
import org.junit.jupiter.api.Test;

import static jdk.internal.classfile.impl.verifier.VerifierImpl.verify;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    ProductApiClient pacmock = mock(ProductApiClient.class);
    Product productAttendu = new Product("1", "tshirt");
    @Test
    void getProductCheck() throws IncompatibleDataFormatException, ApiCallFaillureException {
        when(pacmock.getProduct("1")).thenReturn(productAttendu);

        ProductService productService = new ProductService(pacmock);

        Product resultat = productService.getProduct("1");
        Product resultat2 = productService.getProduct("2");
        verify(pacmock).getProduct("1");
        // on verifie si le produit est bien lui meme
        assertEquals(productAttendu, resultat);
        // on verifier que meme avec un autre produit on le trouve pas
        assertNotEquals(productAttendu, resultat2);
    }

    @Test
    void ArgImcompatible() throws IncompatibleDataFormatException, ApiCallFaillureException {
        String id = "555";
        ProductService productService = new ProductService(pacmock);
        when(pacmock.getProduct(id)).thenThrow(new IncompatibleDataFormatException());

        // Appel de la méthode à tester
        assertThrows(IncompatibleDataFormatException.class, () -> {productService.getProduct(id);});

        // Vérifier que getProduct a été appelé avec le bon argument
        verify(pacmock).getProduct(id);
    }

    @Test
    void echecAplApi() throws IncompatibleDataFormatException, ApiCallFaillureException {
        String id = "152";

        ProductService productService = new ProductService(pacmock);
        when(pacmock.getProduct(id)).thenThrow(new ApiCallFaillureException());
        assertThrows(ApiCallFaillureException.class, ()->{productService.getProduct(id);});
        verify(pacmock).getProduct(id);

    }
}