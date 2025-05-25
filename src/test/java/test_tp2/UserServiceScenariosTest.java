package test_tp2;

import org.example.tp2.exo2.ServiceException;
import org.example.tp2.exo2.UserService;
import org.example.tp2.exo2.Utilisateur;
import org.example.tp2.exo2.UtilisateurApi;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceScenariosTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;

    @InjectMocks
    private UserService userService;

    @Test
    void test_ExceptionCreationUtilisateur() throws ServiceException {
        // Arrange
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");
        doThrow(new ServiceException("Échec de la création")).when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // Act & Assert
        assertThrows(ServiceException.class, () -> userService.creerUtilisateur(utilisateur));
        verify(utilisateurApiMock).creerUtilisateur(utilisateur);
    }

    @Test
    void test_CaptureArguments() throws ServiceException {
        // Arrange
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");
        ArgumentCaptor<Utilisateur> captor = ArgumentCaptor.forClass(Utilisateur.class);
        doNothing().when(utilisateurApiMock).creerUtilisateur(captor.capture());

        // Act
        userService.creerUtilisateur(utilisateur);

        // Assert
        Utilisateur utilisateurCapture = captor.getValue();
        assertEquals("Jean", utilisateurCapture.getPrenom());
        assertEquals("Dupont", utilisateurCapture.getNom());
    }
}