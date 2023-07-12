package org.example.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InArrayTest {
    InArray inArray = new InArray();

    @Test
    void searchLinear() {
        int[] arr = {3, 2, 5, 78, 49, 4, 2, 5};
        int find = 4;
        int resultIndex = 5;
        assertEquals(resultIndex, inArray.searchLinear(arr, 4));
    }

    @Test
    void searchBinary() {
        int[] arr = {2, 2, 3, 4, 5, 5, 49, 78};
        int find = 49;
        int resultIndex = 6;
        assertEquals(resultIndex, inArray.searchBinary(arr, find, 0, arr.length - 1));

    }

    @Test
    void searchBinaryIterative() {
        int[] arr = {2, 2, 3, 4, 5, 5, 49, 78};
        int find = 49;
        int resultIndex = 6;
        assertEquals(resultIndex, inArray.searchBinaryIterative(arr, find));

    }
}