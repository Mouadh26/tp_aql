package test_tp0;

import org.example.tp0.Factorial;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @ParameterizedTest
    @CsvSource({"0, 1", "1, 1", "5, 120", "3, 6"})
    void factorial_ReturnsCorrectValue(int n, int expected) {
        assertEquals(expected, Factorial.factorial(n));
    }

    @Test
    void factorial_ThrowsExceptionForNegativeN() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}