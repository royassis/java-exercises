package exercise;

import java.util.ArrayList;

public class Ex172 {

    public static void main(String[] args) {
        Integer[] arrA = {1,2,3,4,5};
        Integer[] arrB= {4,5};

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int b : arrB){
            for (int a : arrA){
                if (b > a){
                    result.add(a);
                }
            }
        }
        System.out.println(result);

    }

}
