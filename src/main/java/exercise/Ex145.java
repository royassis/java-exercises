package exercise;

import java.util.*;
// Write a Java program to remove the nth element from the end of a given list

public class Ex145 {
    public static void main(String[] args) {
        Integer[] arr = {3,3,2, 4};
        Integer i = 3;

        for (int j=i; j< arr.length-1; j++){
            arr[j] = arr[j+1]; 
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, arr.length-1)));
    }
}
