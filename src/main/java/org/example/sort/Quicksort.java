package org.example.sort;
//O(n*log n)
public class Quicksort {

    public int[] sorting (int [] array, int start, int end){
        if (start < end) {
            int pivotInd = sort(array, start, end);

            sorting(array, start, pivotInd - 1);
            sorting(array, pivotInd, end);
        }
        return array;
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
        return startIndex;
    }
}
