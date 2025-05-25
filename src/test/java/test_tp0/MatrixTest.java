package test_tp0;

import org.example.tp0.Matrix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    @Test
    void add_ThrowsExceptionOnSizeMismatch() {
        Matrix m1 = new Matrix(2);
        Matrix m2 = new Matrix(3);
        assertThrows(IllegalArgumentException.class, () -> m1.add(m2));
    }

    @Test
    void multiply_CorrectlyComputesProduct() {
        Matrix m1 = new Matrix(2);
        m1.set(0, 0, 1); m1.set(0, 1, 2);
        m1.set(1, 0, 3); m1.set(1, 1, 4);

        Matrix m2 = new Matrix(2);
        m2.set(0, 0, 5); m2.set(0, 1, 6);
        m2.set(1, 0, 7); m2.set(1, 1, 8);

        m1.multiply(m2);
        assertEquals(19, m1.get(0, 0));
        assertEquals(22, m1.get(0, 1));
    }

    @Test
    void transpose_SwapsRowsAndColumns() {
        Matrix m = new Matrix(2);
        m.set(0, 0, 1); m.set(0, 1, 2);
        m.set(1, 0, 3); m.set(1, 1, 4);
        m.transpose();
        assertEquals(1, m.get(0, 0));
        assertEquals(3, m.get(0, 1));
        assertEquals(2, m.get(1, 0));
        assertEquals(4, m.get(1, 1));
    }
}