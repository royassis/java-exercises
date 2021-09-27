package exercise;

import java.util.Arrays;

// Write a Java program to find a contiguous subarray with largest sum from a given array of integers
public class Ex123 {
    public static void main(String[] args) {
        Integer arrSize = 8;
        Integer[] arr = getRandomArr(arrSize, -5, 5);
        Integer[] subArr = {arr[0]};
        Integer sum = arr[0];
        Integer tmpSum = sum;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                tmpSum = sumArr(getSubArr(arr, i, j + 1));
                if (tmpSum < sum) {
                    sum = tmpSum;
                    subArr = getSubArr(arr, i, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(subArr));


    }

    public static Integer getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static Integer[] getRandomArr(int size, int min, int max) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = getRandomNumber(min, max);
        }
        return arr;
    }

    public static Integer sumArr(Integer[] arr) {
        Integer sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static Integer[] getSubArr(Integer[] arr, Integer start, Integer end) {
        return Arrays.copyOfRange(arr, start, end);
    }
}