package exercise;

import java.util.Arrays;

//  Write a Java program to find the kth smallest and largest element in a given array;

public class Ex161 {
    public static void main(String[] args) {

        Integer [] arr = {1, 4, 17, 7, 25, 3, 100};
        int k=  2;
        Arrays.sort(arr);
        System.out.println(arr[k]);
        System.out.println(arr[arr.length-k]);
    }
}
