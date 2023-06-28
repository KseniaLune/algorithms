package org.example.sort;

//O(n*logn)

public class HeapSort {
    public static void sorting(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i,0);
        }
    }

    private static void heapify(int[] arr, int length, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < length && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }
        if (rightChild < length && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }
        if (i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, length, largest);
        }
    }
}
