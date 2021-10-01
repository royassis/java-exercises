package exercise;

import java.util.*;

//  Write a Java program to find the kth smallest and largest element in a given array;

public class Ex162 {
    public static void main(String[] args) {

        int [] arr = {1, 4, 17, 7, 25, 3, 100};
        Double mean = Arrays.stream(arr).average().orElse(Double.NaN);

        for (int x : arr){
            if (x > mean){
                System.out.println(x);
            }
        }

        System.out.println(Arrays.stream(arr).reduce(Integer::sum).getAsInt()/arr.length);

    }
}
