package org.example.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

//On^2
public class BubbleSort {
    public void sorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
