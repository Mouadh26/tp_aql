package test_tp1.exo4;

import org.example.tp1.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class QuadraticEquationLineCoverageTest {
    @Test
    void testTwoRealRoots() {
        assertArrayEquals(new double[]{2.0, 1.0}, QuadraticEquation.solve(1, -3, 2));
    }

    @Test
    void testNoRealRoots() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }
}