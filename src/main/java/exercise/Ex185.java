package exercise;

import java.util.HashMap;

/*
Write a Java program to check if two given strings are isomorphic or not.
Example-1: The words "abca" and "zbxz" are isomorphic because we can map 'a' to 'z', 'b' to 'b' and 'c' to 'x'.
Example-1: The words "bar" and "foo" are not isomorphic because we can map 'f' to 'b', 'o' to 'a' and 'o' to 'r'.
*/

public class Ex185 {

    public static void main(String[] args) {
        String a = "yyx";
        String b = "xxy";

        System.out.println(areStringsIsomorphic(a, b));

    }
    static Boolean areStringsIsomorphic (String a, String b){
        HashMap<Character,Character> hashMap = new HashMap<Character,Character>();

        for (int i = 0; i < a.length(); i++) {

            if (hashMap.get(b.charAt(i)) != null){
                if (hashMap.get(b.charAt(i)) != a.charAt(i)){
                    return false;
                }
            }else{
                hashMap.put(b.charAt(i), a.charAt(i));
            }
        }
        return true;
    }
}
