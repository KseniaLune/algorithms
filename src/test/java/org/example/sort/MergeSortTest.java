package org.example.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
 MergeSort mergeSort = new MergeSort();
 @Test
 public void sortSimpleArray(){
     int [] array = {3,5,2,1,4};
     int [] arraySort = {1,2,3,4,5};

     assertArrayEquals(arraySort, mergeSort.sort(array));
 }
    @Test
    public void sortDifficultArray(){
        int [] array = {100,0,325,345,23,6,1,1,1,8};
        int [] arraySort = Arrays.stream(array).sorted().toArray();

        assertArrayEquals(arraySort, mergeSort.sort(array));
    }
}