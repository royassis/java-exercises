package exercise;

import java.util.*;
//Write a Java program to check if a given string has all unique characters

public class Ex144 {
    public static void main(String[] args) throws Exception {
        Integer n = 3;
        Integer[] arr = {3,3,3};
        // Integer[] arr = { 3, 1, 1, 2, 3, 3, 5};
        // Integer[] arr = { 1, 2, 3, 3, 5};
        // Integer[] arr = {  1,3, 2, 3, 3, 5};
        // Integer[] arr = {  1,3,3, 2, 3, 3, 5, 6};
        // Integer[] arr = {1, 2, 3, 3, 5, 3};
        // Integer[] arr = {1, 2, 3, 3, 5, 3, 3};


        System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(foo(n,arr)));
        System.out.println(Arrays.toString(bar(n, arr)));

    }
    
    // Sort and cut at end
    static Integer[] foo(Integer n, Integer[] arr) {
        Integer counter = 0;
        Boolean flag = true;
        for (Integer m : arr) {
            if (n == m) {
                counter++;
            }
        }

        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == n && arr[i + 1] != n) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = n;
                    flag = true;
                }
            }
        }
        return Arrays.copyOfRange(arr, 0, arr.length - counter);
    }

    static Integer[] bar(Integer n, Integer[] arr) throws InterruptedException {

        int gap = 0;
        int i = 0;
        while (i < arr.length ) {
            int j = i + gap;
            while (j < arr.length && arr[j] == n) {
                j++;
                gap++;
            }
            if (j >= arr.length){
                break;
            }
            arr[i] = arr[j];
            i++;
            System.out.print(Arrays.toString(arr)+"\r");
            java.util.concurrent.TimeUnit.SECONDS.sleep(1);
        }
        System.out.println();
        return Arrays.copyOfRange(arr, 0, arr.length-gap);
    }
}
