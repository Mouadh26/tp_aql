package test_tp1.exo3;

import org.example.tp1.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchBranchCoverageTest {
    @Test
    void testEmptyArray() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{}, 5));
    }

    @Test
    void testSingleElementFound() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{5}, 5));
    }
}