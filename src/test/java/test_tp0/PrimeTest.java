package test_tp0;

import org.example.tp0.Prime;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @ParameterizedTest
    @CsvSource({"2, true", "3, true", "4, false", "1, false", "25, false"})
    void isPrime_ReturnsCorrectResult(int n, boolean expected) {
        assertEquals(expected, Prime.isPrime(n));
    }
}