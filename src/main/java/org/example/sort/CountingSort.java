package org.example.sort;

//O(2n)
//проблемы с памятью из-за создания массива диапазона чисел
public class CountingSort {
    public int[] sorting(int[] arr, int maxValue) {
        int[] count = new int[maxValue];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int arrayIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[arrayIndex] = i;
                arrayIndex++;
            }
        }
        return arr;
    }
}
