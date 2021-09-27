package exercise;

import java.util.*;

// Write a Java program to find a number that appears only once in a given array of integers, all numbers occur twice
public class Ex129 {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        System.out.println(String.format("%s", Arrays.toString(arr)));

        for (Integer n : arr) {
            hashMap.merge(n, 1, Integer::sum);
        }
        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) == 1) {
                System.out.println(key);
                break;
            }
        }

    }

}