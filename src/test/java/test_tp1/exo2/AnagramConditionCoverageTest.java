package test_tp1.exo2;

import org.example.tp1.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramConditionCoverageTest {
    @Test
    void testCaseInsensitive() {
        assertTrue(Anagram.isAnagram("Listen", "Silent"));
    }

    @Test
    void testWithSpaces() {
        assertTrue(Anagram.isAnagram("Debit card", "Bad credit"));
    }
}