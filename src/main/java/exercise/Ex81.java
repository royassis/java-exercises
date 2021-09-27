package exercise;

import java.util.*;


public class Ex81 {
    public static void main(String[] args) {
        Integer[] arr = {10, 2, 3, 4, 5, 1};
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        arr2[0] = arr[arr.length - 1];
        arr2[arr.length - 1] = arr[0];

        for (Integer n : arr2) {
            System.out.print(n + " ");
        }
    }
}