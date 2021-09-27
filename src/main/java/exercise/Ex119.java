package exercise;

import java.util.Arrays;

// Write a Java program to get the first occurrence (Position starts from 0.) of an element of a given array
public class Ex119 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        Integer n = Integer.parseInt(args[0]);

        Integer res = getEleIndexInArrBinarySearch(arr, n);
        if (res != null) {
            System.out.println(String.format("Element %d was found in arr %s at position %d", n, Arrays.toString(arr), res));
        } else {
            System.out.println(String.format("Element %d was not found in arr %s", n, Arrays.toString(arr)));
        }

    }

    static Integer getEleIndexInArr(Integer[] arr, Integer ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return null;
    }

    static Integer getEleIndexInArrBinarySearch(Integer[] arr, Integer ele) {
        int start = 0;
        int end = arr[arr.length - 1];
        Integer retval = null;

        if (ele > arr[arr.length - 1]) {
            return retval;
        }

        while (start <= end) {
            Integer mid = (start + end) / 2;
            if (arr[mid] == ele) {
                return mid;
            } else if (arr[mid] < ele) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return retval;
    }
}