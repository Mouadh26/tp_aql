package org.example.tp3.Exo1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

class UserServiceTest {

    UserRepository userRepository = mock(UserRepository.class);

    UserService userService = new UserService(userRepository);

    @Test
    void getUserById() {
        long UserId = 123;
        User UserAttendu = new User(UserId, "Nana");

        //definir le comportement
        when(userRepository.findUserById(UserId)).thenReturn(UserAttendu);

        // le resultat actuel de la methode
        User UserActuel = userService.getUserById(UserId);

        // Vérification du résultat
        assertEquals(UserAttendu, UserActuel);

        //le verification
        verify(userRepository).findUserById(UserId);
    }
}