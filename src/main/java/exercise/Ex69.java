package exercise;

import java.util.Scanner;

public class Ex69 {
    static final int minLength = 3;
    static final int nTimes = 4;

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        System.out.println(input.substring(0, input.length() / 2));
        inputScanner.close();
    }
}