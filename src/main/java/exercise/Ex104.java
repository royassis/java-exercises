package exercise;

import java.util.ArrayList;

public class Ex104 {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {5, 5, 10};
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int n = 10;
        boolean flag = true;

        for (int m : arr) {
            if (m == n) {
                flag = false;
            }
            if (flag) {
                arrList.add(m);
            }
        }
        System.out.println(arrList);

    }
}
