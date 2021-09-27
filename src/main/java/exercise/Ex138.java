package exercise;

import java.util.*;

class Ex138 {
    public static void main(String[] args) {
        String[] strings = {"cat", "dog", "red", "is", "am"};

        ArrayList<String> longestStrings = new ArrayList<String>();
        Integer longest = 0;

        for (String str : strings) {
            if (str.length() > longest) {
                longest = str.length();
                longestStrings = new ArrayList<String>();
                longestStrings.add(str);
            } else if (str.length() == longest) {
                longestStrings.add(str);
            }
        }

        System.out.println(longestStrings);
    }

}
