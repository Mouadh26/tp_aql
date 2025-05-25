package test_tp1.exo1;

import org.example.tp1.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeBranchCoverageTest {
    @Test
    void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }
}