package org.example.sedgewick;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
    // { -40 -30 -20 0 5 10 20 30 40} //count = 5
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        long start = System.nanoTime();
        System.out.println(count(arr));
        long end = System.nanoTime();

        System.out.println("time = "+(end-start));
    }

    public static int count(int[] arr) {//brute-force
        int length = arr.length, count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                    }

                }
            }
        }
        return count;
    }

}
