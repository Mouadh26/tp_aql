package test_tp1.exo6;

import org.example.tp1.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzLineCoverageTest {
    @Test
    void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }
}