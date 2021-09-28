package exercise;

import java.util.*;
//Write a Java program to check if a given string has all unique characters

public class Ex143 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrList2 = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> a;
        Integer k;

        arrList1.add(1);
        arrList1.add(4);

        arrList2.add(2);
        arrList2.add(9);
        arrList2.add(10);

        
        System.out.println(arrList1);
        System.out.println(arrList2);


        int i = 0;
        int j = 0;
        while (i < arrList1.size() && j < arrList2.size()){
            if(arrList1.get(i)<arrList2.get(j)){
                result.add(arrList1.get(i));
                i++;
            }else{
                result.add(arrList2.get(j));
                j++;
            }
        }

        a = arrList1.size() == i+1 ? arrList1: arrList2;
        k = arrList1.size() == i+1 ? i: j;
        for (; k < a.size(); k++){
            result.add(a.get(k));
        }

        System.out.println(result);

    }
}
