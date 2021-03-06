package exercise;

import java.util.Arrays;

// Write a Java program to check if a given string is a permutation of another given string.

public class Ex149 {

    public static void main(String[] args) {
        String strA = "za";
        String strB = "az";

        System.out.println(checkPermutation(strA, strB));

    }

    static Boolean checkPermutation(String strA, String strB) {
        Character a = 'a';
        Character z = 'z';
        int delta = z - a;

        int[] arr = new int[(z - a + 1) * 2];
        fillArr(strA, arr, 0);
        fillArr(strB, arr, delta+1);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < delta; i++) {
            int j = i + delta + 1;
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }

    static void fillArr(String str, int[] arr, Integer delta) {
        Character a = 'a';
        for (Character c : str.toCharArray()) {
            int i = c - a + delta;
            arr[i]++;
        }
    }
}
