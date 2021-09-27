package exercise;

import java.util.*;

// Write a Java program to get the index of the first number and the last number of a subarray where the sum of numbers is zero from a given array of integers
public class Ex139 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Integer[] arr = {1, 2, 3, -3};
        Integer m = 0;

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], i);
        }

        for (Integer n : hashMap.keySet()) {

            if (hashMap.get(m - n) != null) {
                String s = String.format("%d %d", hashMap.get(m - n), hashMap.get(n));
                System.out.println(s);
                break;
            }
        }

    }
}