
package exercise; 

import java.util.Arrays;

public class Ex113 {
    public static void main(String[] args) {
        Integer[] arr1 = { 1 };
        Integer[] arr2 = {3, 4, 5, 6 };
        Integer[] a;
        Integer[] result = new Integer[arr1.length + arr2.length];

        int i, j, k, l;
        i = j = k  = l = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        a = j > arr2.length ? arr1 : arr2;
        l = j > arr2.length ? i : j;
        for (; l < a.length; l++) {
            result[k] = a[l];
            k++;
        }

        System.out.println(Arrays.toString(result));

    }

}