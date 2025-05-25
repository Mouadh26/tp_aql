package test_tp1.exo4;

import org.example.tp1.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QuadraticEquationBranchCoverageTest {
    @Test
    void testOneRealRoot() {
        assertArrayEquals(new double[]{2.0}, QuadraticEquation.solve(1, -4, 4));
    }

    @Test
    void testInvalidA() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 2));
    }
}