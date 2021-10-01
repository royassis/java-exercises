package exercise;

import java.util.Arrays;
import java.util.Collections;

//  Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.

public class Ex159 {
    public static void main(String[] args) {

        Integer [] arr = {1, 4, 17, 7, 25, 3, 100};
        int k=  4;
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, k-1)));
    }
}
