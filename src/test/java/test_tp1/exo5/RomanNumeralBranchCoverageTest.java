package test_tp1.exo5;

import org.example.tp1.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanNumeralBranchCoverageTest {
    @Test
    void testInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void testSubtractiveNotation() {
        assertEquals("IV", RomanNumeral.toRoman(4));
    }
}