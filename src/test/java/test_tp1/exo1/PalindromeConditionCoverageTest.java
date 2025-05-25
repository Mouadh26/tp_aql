package test_tp1.exo1;

import org.example.tp1.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeConditionCoverageTest {
    @Test
    void testEvenLength() {
        assertTrue(Palindrome.isPalindrome("abba"));
    }

    @Test
    void testOddLength() {
        assertTrue(Palindrome.isPalindrome("abcba"));
    }

    @Test
    void testMismatchedCharacters() {
        assertFalse(Palindrome.isPalindrome("abca"));
    }
}