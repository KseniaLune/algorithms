package org.example.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    CountingSort countingSort = new CountingSort();
    @Test
    public void sortSimpleArray(){
        int [] array = {3,5,2,1,4};
        int [] arraySort = {1,2,3,4,5};

//        countingSort.sorting(array, 5);
//        assertArrayEquals(arraySort, array);
        assertArrayEquals(arraySort, countingSort.sorting(array,10));
    }
    @Test
    public void sortDifficultArray(){
        int [] array = {100,0,325,345,23,6,1,1,1,8};
        int [] arraySort = Arrays.stream(array).sorted().toArray();

//        countingSort.sorting(array, 345);
//        assertArrayEquals(arraySort, array);
        assertArrayEquals(arraySort, countingSort.sorting(array,350));
    }
}