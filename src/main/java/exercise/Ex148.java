package exercise;

import java.util.HashSet;

//  Write a Java program to find the index of the first unique character in a given string, assume that there is at least one unique character in the string.

public class Ex148 {
    public static void main(String[] args) {

        String str = "aassdrrr";

        long startTime = System.nanoTime();
        Integer i = mySolution(str);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(String.format("%d %d", i, duration / 1000));

        startTime = System.nanoTime();
        i = first_Uniq_Char(str);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(String.format("%d %d", i, duration / 1000));

    }

    public static int mySolution(String str) {
        Character last = null;
        Integer lastIdx = null;
        HashSet<Character> hashSet = new HashSet<Character>();

        // My solution
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (!hashSet.contains(c)) {
                hashSet.add(c);
                if (last == null) {
                    last = c;
                    lastIdx = i;
                }
            } else {
                if (last.equals(c)) {
                    last = null;
                    lastIdx = null;
                }
            }
        }
        return lastIdx;
    }

    public static int first_Uniq_Char(String s) {
        char a = 'a'; 
        char z = 'z'; 
        int[] freq = new int[z-a+1];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
