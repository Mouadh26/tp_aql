package test_tp1.exo6;

import org.example.tp1.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzBranchCoverageTest {
    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void testNumber() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }
}