package exercise;

import java.util.*;
// Write a Java program to check if two given strings are anagrams or not.
import java.util.Map.Entry;

public class Ex142 {
    public static void main(String[] args) throws Exception {

        String str1 = "aasd1";
        String str2 = "asd";

        HashMap<String,Integer> map1= strToHashMap(str1);
        HashMap<String,Integer> map2= strToHashMap(str2);

        if (str1.length() != str2.length()){
            System.out.println("bad");
            System.exit(1);
        }

        for (Entry<String,Integer> entry: map1.entrySet()) {
            if (map2.get(entry.getKey())!= entry.getValue()){
                System.out.println("bad");
                System.exit(1);
            }
        }
        System.out.println("good");

    }
    public static HashMap<String,Integer> strToHashMap(String str){
        HashMap<String,Integer> map= new HashMap<String,Integer>();
        for (int i=0; i< str.length(); i++) {
            String key = str.substring(i, i+1);
            if (map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        return map;
    }

}   

