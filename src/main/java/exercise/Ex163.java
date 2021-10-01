package exercise;

import java.util.*;

//  Write a Java program to find the kth smallest and largest element in a given array;

public class Ex163 {
    public static void main(String[] args) {

        Integer a = 4;
        int cnt = 0;

        while (a > 0) {
            if (a % 2 == 1) {
                cnt++;
            }
            a = a / 2;
        }
        System.out.println(cnt);

        a = 4;
        cnt = 0;
        while (a > 0) {
            if ((a & 1) == 1) {
                cnt++;
            }
            a = a >> 1;
        }
        System.out.println(cnt);

    }
}
