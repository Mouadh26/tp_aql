package test_tp1.exo1;

import org.example.tp1.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeLineCoverageTest {
    @Test
    void testValidPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    void testIgnoreCaseAndSpaces() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }
}