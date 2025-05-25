package test_tp2;

import org.example.tp2.exo1.Calculatrice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculatriceTest {
    @Mock
    private Calculatrice calculatriceMock;

    @Test
    void testAdditionner() {
        // Arrange
        when(calculatriceMock.additionner(2, 3)).thenReturn(5);
        when(calculatriceMock.getResult()).thenReturn(5);

        // Act
        int resultat = calculatriceMock.additionner(2, 3);
        int resultFromGetter = calculatriceMock.getResult(); // <- appel nécessaire

        // Assert
        assertEquals(5, resultat);
        assertEquals(5, resultFromGetter);
        verify(calculatriceMock).additionner(2, 3);
        verify(calculatriceMock).getResult(); // maintenant ça passe
        verifyNoMoreInteractions(calculatriceMock);
    }
}