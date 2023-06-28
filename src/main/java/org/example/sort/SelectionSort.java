package org.example.sort;

//O(n^2)
public class SelectionSort {
    public static void sorting(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int minId = i;
            int min = arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<min){
                    minId = j;
                    min = arr[j];
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
    }

}
