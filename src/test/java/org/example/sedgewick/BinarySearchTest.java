package org.example.sedgewick;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    void search() {
        //when
        int[] arr = {0,10,20,30,40,55,60,70};
        int target = 55;

        //then
        assertEquals(5, binarySearch.search(arr, target));
    }
}