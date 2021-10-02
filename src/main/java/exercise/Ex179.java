package exercise;

import java.util.Arrays;

public class Ex179 {

    public static void main(String[] args) {
        Integer[] arr = {1,9,9,9};
        Integer[] out = new Integer[arr.length+1];
        int a = 1;
        for (int i = arr.length-1; i >=0; i--) {
            out[i+1] = (arr[i] +a)%10;
            a = (arr[i] +a)/10;
        }

        out[0] = a;
        System.out.println(Arrays.toString(out));

    }
}
