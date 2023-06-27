package org.example.sort;
//O(n*log n)
public class MergeSort {
    public int[] sort (int [] arr){
        int length = arr.length;
        if (length<2){
            return arr;
        }
        int mid = length/2;
        int [] left = new int[mid];
        int [] right = new int[length-mid];

        for (int i = 0; i<mid; i++){
            left[i] = arr[i];
        }
        for (int i = mid, j=0; i<length && j<length-mid; i++, j++){
            right[j] = arr[i];
        }
        sort(left);
        sort(right);

        merge(arr, left, right, mid, length-mid);
        return arr;
    }
    private void merge (int [] arr, int [] left, int [] right, int leftL, int rightL){
        int i = 0, j = 0;
        int k = 0;
        while (i<leftL&&j<rightL) {
            if (left[i]<right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right [j++];
            }
        }
        while (i<leftL){
            arr[k++] = left[i++];
        }
        while (j<rightL){
            arr[k++] = right[j++];
        }

    }
}
