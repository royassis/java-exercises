package exercise;

import java.util.Arrays;

//  Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.

public class Ex159 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k=  4;
        int[] output = new int[k];

        int max = arr[0];
        for (int x : arr){
            if (x > max)
                max = x;
            }

        output[k-1] = max;
        for (int i = k -2; i>=0 ; i--){
            max = 0;
            for (int x : arr){
                if (x > max && x < output[i+1]){
                    max = x;
                }
            }
            output[i] = max;
        }

        System.out.println(Arrays.toString(output));
    }
}
