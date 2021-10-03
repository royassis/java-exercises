package utils;

import java.util.Arrays;

public class Utils {
    public static Integer getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max + 1 - min)) + min);
    }

    public static Integer getNthDigit(Integer n, Integer digit) {
        return (int) ((n / Math.pow(10, digit - 1)) % 10);
    }

    public static Integer getFirstDigit(Integer n, Integer length) {
        return getNthDigit(n, length);
    }

    public static Integer getFirstDigit(Integer n) {
        Integer length = 0;
        while (n > 0) {
            length++;
            n = n / 10;
        }

        return (int) ((n / Math.pow(10, length - 1)) % 10);
    }

    public static Integer getNumberLength(Integer n) {
        Integer length = 0;
        while (n > 0) {
            length++;
            n = n / 10;
        }
        return length;
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

    public static String zfill(String s, int len, String filler) {
        int diff = len - s.length();
        diff = diff<0 ? 0 : diff;
        return filler.repeat(diff) + s;
    }

}
