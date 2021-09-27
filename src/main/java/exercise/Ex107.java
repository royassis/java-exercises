package exercise;

import java.util.*;


public class Ex107 {
    public static void main(String[] args) throws InterruptedException {
        Integer[] baseArr = {10, 5, 10};
        Integer[] shiftedArr = new Integer[baseArr.length];

        for (int i = 0; i < baseArr.length - 1; i++) {
            shiftedArr[i] = baseArr[i + 1];
        }

        shiftedArr[shiftedArr.length - 1] = baseArr[0];
        System.out.println(Arrays.toString(shiftedArr));

    }
}
