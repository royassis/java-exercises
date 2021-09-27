package exercise;

import java.util.ArrayList;

public class Ex103 {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {10, 5, 10};
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int n = 10;
        boolean flag = false;

        for (int m : arr) {
            if (flag) {
                arrList.add(m);
            }
            if (m == n) {
                flag = true;
            }
        }
        System.out.println(arrList);

    }
}
