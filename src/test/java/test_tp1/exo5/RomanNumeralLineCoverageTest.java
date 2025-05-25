package test_tp1.exo5;

import org.example.tp1.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralLineCoverageTest {
    @Test
    void testBasicConversion() {
        assertEquals("XIV", RomanNumeral.toRoman(14));
    }

    @Test
    void testMaxValue() {
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }
}