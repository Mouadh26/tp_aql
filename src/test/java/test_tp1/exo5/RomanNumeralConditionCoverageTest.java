package test_tp1.exo5;

import org.example.tp1.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralConditionCoverageTest {
    @Test
    void testRepeatedSymbols() {
        assertEquals("III", RomanNumeral.toRoman(3));
    }

    @Test
    void testMidRangeValue() {
        assertEquals("LXXVII", RomanNumeral.toRoman(77));
    }
}