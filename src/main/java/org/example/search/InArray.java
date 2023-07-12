package org.example.search;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class InArray {
    //задача - найти элемент в массиве, необходимо вернуть его индекс или -1
    //O(n)
    public int searchLinear(int [] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
    //O(logn)
    public int searchBinary(int [] arrSorted, int element, int starIndex, int endIndex){
        if(starIndex<=endIndex){
            int midIndex = starIndex + (endIndex-starIndex)/2;

            if(arrSorted[midIndex]==element){
                return midIndex;
            }
            if (arrSorted[midIndex]<element){
                return searchBinary(arrSorted,element,midIndex+1, endIndex);
            } else {
                return searchBinary(arrSorted,element, starIndex, midIndex-1);
            }

        }
        return -1;
    }
    public int searchBinaryIterative(int [] arrSorted, int element){
        int starIndex = 0, endIndex = arrSorted.length-1, midIndex;

        while (starIndex<=endIndex){
            midIndex = starIndex + (endIndex-starIndex)/2;

            if(arrSorted[midIndex]==element){
                return midIndex;
            }
            if (arrSorted[midIndex]<element){
                starIndex = midIndex+1;
            } else {
                endIndex = midIndex-1;
            }

        }
        return -1;
    }

}
