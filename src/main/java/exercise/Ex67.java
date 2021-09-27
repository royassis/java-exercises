package exercise;

import java.util.*;

/**
 * Write a description of class Ex67 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex67 {
    public static void main(String[] args) {
        String out = "";
        String s = "Python 3.0";
        ArrayList<String> arrayList = new ArrayList<String>();
        Collections.addAll(arrayList, s.split(" "));

        arrayList.add(arrayList.size() / 2, "newele");

        for (String s1 : arrayList) {
            out = out + s1 + " ";
        }
        System.out.println(out);
    }
}
