package test_tp0;

import org.example.tp0.Fibonacci;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1", "5, 5", "10, 55"})
    void fibonacci_ReturnsCorrectValue(int n, int expected) {
        assertEquals(expected, Fibonacci.fibonacci(n));
    }

    @Test
    void fibonacci_ThrowsExceptionForNegativeN() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
}