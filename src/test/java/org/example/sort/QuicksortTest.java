package org.example.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuicksortTest {
    Quicksort quicksort = new Quicksort();
    @Test
    public void sortSimpleArray(){
        int [] array = {3,5,2,1,4};
        int [] arraySort = {1,2,3,4,5};

        assertArrayEquals(arraySort, quicksort.sorting(array, 0, array.length-1));
    }
    @Test
    public void sortDifficultArray(){
//        int [] array = {100,0,325,345,23,6,1,1,1,8};
        int [] array = {8,6,12,1,14,10,9,15,2,4};
        int [] arraySort = Arrays.stream(array).sorted().toArray();

        assertArrayEquals(arraySort, quicksort.sorting(array, 0, array.length-1));
    }



}