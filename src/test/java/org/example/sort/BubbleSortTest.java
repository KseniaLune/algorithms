package org.example.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void simpleTest (){
        int [] array = {3,5,2,1,4};
        int [] arraySort = Arrays.stream(array).sorted().toArray();

        assertArrayEquals(arraySort, bubbleSort.sorting(array));

    }
    @Test
    public void hardTest (){

        int [] array = {100, -8,4,0,0,23,83,-5436,1};
        int [] arraySort = Arrays.stream(array).sorted().toArray();

        assertArrayEquals(arraySort, bubbleSort.sorting(array));
    }

}