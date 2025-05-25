package test_tp1.exo3;

import org.example.tp1.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchLineCoverageTest {
    @Test
    void testFound() {
        assertEquals(2, BinarySearch.binarySearch(new int[]{1, 3, 5, 7}, 5));
    }

    @Test
    void testNotFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7}, 2));
    }
}