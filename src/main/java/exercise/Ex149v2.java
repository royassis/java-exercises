package exercise;

import java.util.Arrays;

// Write a Java program to check if a given string is a permutation of another given string.

public class Ex149v2 {

    public static void main(String[] args) {
        String strA = "za";
        String strB = "aza";

        System.out.println(checkPermutation(strA, strB));

    }

    static Boolean checkPermutation(String strA, String strB) {
        Character a = 'a';
        Character z = 'z';

        int[] arr = new int[z - a + 1];
        for (Character c : strA.toCharArray()) {
            arr[c - a]++;
        }
        for (Character c : strB.toCharArray()) {
            arr[c - a]--;
        }

        System.out.println(Arrays.toString(arr));

        for (int n : arr) {
            if(n!=0){
                return false;
            }
        }
        return true;
    }

}
