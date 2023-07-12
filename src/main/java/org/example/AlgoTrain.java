package org.example;

import java.util.Arrays;

public class AlgoTrain {
    public static void main(String[] args) {
        int[] array = {1, 8, 16, 0, 2, 3, 5, 4};
        System.out.println(Arrays.toString(sort(array)));
    }

    private static int[] sort(int[] array) {
        //bubbleSort

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if(array[i]<array[j]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        return array;

        //counting sort
//        int maxVal = 20;
//
//        int[] counter = new int[maxVal];
//        for (int i = 0; i < array.length; i++) {
//            counter[array[i]]++;
//        }
//        int index = 0;
//        for (int i = 0; i < counter.length; i++) {
//            while (counter[i] != 0) {
//                counter[i]--;
//                array[index] = i;
//                index++;
//
//            }
//        }
//
//        return array;
//    }

        int start = 0;
        int end = array.length-1;

        return sorted(array, start, end);
    }

    private static int[] sorted(int[] array, int start, int end) {
        if (start < end) {
            int mid = sorting(array, start, end);
            sorted(array, start, mid - 1);
            sorted(array, mid, end);
        }
        return array;
    }

    private static int sorting(int[] array, int start, int end) {
        int pivot = array[start];
        int lInd = start;
        int rInd = end;
        while (lInd <= rInd) {
            while (array[lInd] < pivot) {
                lInd++;
            }
            while (array[rInd] > pivot) {
                rInd--;
            }
            if (lInd <= rInd) {
                int temp = array[lInd];
                array[lInd] = array[rInd];
                array[rInd] = temp;
                lInd++;
                rInd--;
            }
        }
        return lInd;
    }


}

