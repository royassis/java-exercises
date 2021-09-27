package exercise;

import utils.Utils;
/*
Write a Java program to find the distinct ways you can climb to the top (n steps to reach to the top) of stairs.
Each time you can either climb 1 or 2 steps.
*/

public class Ex134 {
    public static void main(String[] args) {
        Integer[] arr = Utils.getRandomArr(5,0,8);    

        System.out.println(getDistinctWaysToClimbArr(arr));
    }

    public static Integer getDistinctWaysToClimbArr(Integer[] arr){
        return getDistinctWaysToClimbArrBase(arr, 0);
    }

    public static Integer getDistinctWaysToClimbArrBase(Integer[] arr , Integer splitIndex){
        if (arr.length <= splitIndex+1){
            return splitIndex;
        }
        Integer s1 = null;
        if (arr.length > splitIndex+1){
             s1 = getDistinctWaysToClimbArrBase(arr, splitIndex+1);
        }
        if (arr.length > splitIndex+2){
            getDistinctWaysToClimbArrBase(arr, splitIndex+2);
        }
        
        return s1;
    }

}