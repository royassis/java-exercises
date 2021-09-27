package exercise;

import java.util.Scanner;

public class Ex70 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String stringA = inputScanner.nextLine();
        String stringB = inputScanner.nextLine();

        if (stringA.length() == stringB.length()) {
            System.out.println("Strings must be of diff length");
            System.exit(1);
        } else if (stringA.length() > stringB.length()) {
            System.out.println(stringB + stringA + stringB);
        } else {
            System.out.println(stringA + stringB + stringA);
        }
        inputScanner.close();
    }
}