package test_tp1.exo2;

import org.example.tp1.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AnagramBranchCoverageTest {
    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test"));
    }
}