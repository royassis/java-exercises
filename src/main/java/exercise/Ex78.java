package exercise;

import java.util.*;


public class Ex78 {
    public static void main(String[] args) {
        Integer[] arr = {10, 1};
        Integer[] arr2 = {4, 10};


        for (Integer n : arr) {
            if (Arrays.stream(arr2).anyMatch(n::equals)) {
                System.out.println(true);
            }
        }
    }
}