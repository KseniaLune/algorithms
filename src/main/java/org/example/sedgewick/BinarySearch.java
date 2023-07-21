package org.example.sedgewick;

import java.util.Arrays;

public class BinarySearch {

    public int search(int[] arr, int target) {
        int startInd = 0, endInd = arr.length - 1;
        while (startInd <= endInd) {
            int mid = startInd + (endInd - startInd) / 2;

            if (arr[mid] > target) {
                endInd = mid - 1;
            } else if (arr[mid] < target) {
                startInd = mid + 1;
            } else {
                if (arr[mid] == target) return mid;
            }

        }
        return -1;
    }
}
