package org.example.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {
    HeapSort heapSort = new HeapSort();
    @Test
    public void sortSimpleArray(){
        int [] array = {3,5,2,1,4};
        int [] arraySort = {1,2,3,4,5};
        heapSort.sorting(array);
        assertArrayEquals(arraySort, array);
    }
    @Test
    public void sortDifficultArray(){
        int [] array = {100,0,325,345,23,6,1,1,1,8};
        int [] arraySort = Arrays.stream(array).sorted().toArray();
        heapSort.sorting(array);
        assertArrayEquals(arraySort, array);
    }
}