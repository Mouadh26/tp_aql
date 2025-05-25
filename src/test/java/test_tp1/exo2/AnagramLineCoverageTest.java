package test_tp1.exo2;

import org.example.tp1.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramLineCoverageTest {
    @Test
    void testValidAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    @Test
    void testNonAnagram() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }
}