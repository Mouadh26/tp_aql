package test_tp1.exo3;

import org.example.tp1.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchConditionCoverageTest {
    @Test
    void testFirstElement() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{1, 2, 3}, 1));
    }

    @Test
    void testLastElement() {
        assertEquals(2, BinarySearch.binarySearch(new int[]{1, 2, 3}, 3));
    }
}