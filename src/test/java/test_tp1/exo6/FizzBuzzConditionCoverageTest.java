package test_tp1.exo6;

import org.example.tp1.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzConditionCoverageTest {
    @Test
    void testEdgeCase() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }
}