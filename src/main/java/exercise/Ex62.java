package exercise;

import java.util.*;

public class Ex62 {
    static final Integer minVal = 20;

    public static void main(String[] args) {
        Integer a = 20;
        Integer b = 1;
        Integer c = 2;

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);

        Integer sum = sumOfList(list);
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) >= minVal && list.get(i) > sum - list.get(i)) {
                System.out.println(true);
                System.exit(0);
            }
        }
        System.out.println(false);

    }

    static Integer sumOfList(ArrayList<Integer> list) {
        Integer sum = 0;
        for (int i = 0; i < list.size(); i++) {

            sum = sum + list.get(i);

        }
        return sum;
    }
}
