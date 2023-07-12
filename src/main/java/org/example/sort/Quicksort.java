package org.example.sort;

import java.util.Arrays;

//O(n*log n)
public class Quicksort {

    public int[] sorting (int [] arr, int start, int end){
        if (start < end) {
            int pivotInd = sort(arr, start, end);

            sorting(arr, start, pivotInd - 1);
            sorting(arr, pivotInd, end);
        }
        return arr;
    }
    private int sort (int [] array, int start, int end){
        int startIndex = start;
        int endIndex = end;
        int pivot = array[start];

        while (startIndex<=endIndex){

            while (array[startIndex]<pivot){
                startIndex++;
            }
            while (array[endIndex]>pivot){
                endIndex--;
            }
            if (startIndex<=endIndex){
                int t = array[startIndex];
                array[startIndex] = array[endIndex];
                array[endIndex] = t;
                startIndex++;
                endIndex--;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("pivot = "+pivot);
        System.out.println("return = "+startIndex);
        return startIndex;
    }
}
