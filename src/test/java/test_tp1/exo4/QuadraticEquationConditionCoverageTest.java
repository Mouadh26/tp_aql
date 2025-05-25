package test_tp1.exo4;

import org.example.tp1.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuadraticEquationConditionCoverageTest {
    @Test
    void testDeltaZero() {
        assertArrayEquals(new double[]{1.5, 0.0}, QuadraticEquation.solve(2, -3, 0));

    }

    @Test
    void testNegativeA() {
        assertArrayEquals(new double[]{-1.0, 1.0}, QuadraticEquation.solve(-1, 0, 1));
    }
}