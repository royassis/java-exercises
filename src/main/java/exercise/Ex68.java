package exercise;

import java.util.Scanner;

public class Ex68 {
    static final int minLength = 3;
    static final int nTimes = 4;

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        String out = "";
        if (input.length() < minLength) {
            System.out.println("length of input is less than " + minLength);
            System.exit(0);
        }
        for (int i = 0; i < nTimes; i++) {
            out = out + input.substring(input.length() - 3);
        }
        System.out.println(out);
        inputScanner.close();
    }
}
