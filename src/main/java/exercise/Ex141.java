package exercise;

import java.util.*;
//Write a Java program to check if a given string has all unique characters

public class Ex141 {
    public static void main(String[] args) throws Exception {
        HashMap<String,Integer> map= new HashMap<String,Integer>();

        String str = "asd";
        for (int i = 0; i < str.length(); i++) {
            String key = str.substring(i, i+1);
            if (map.containsKey(key)){
                System.out.println("bad");
                System.exit(1);
            }else{
                map.put(key,1);
            }
        }
        System.out.println("good");
    }
}   

