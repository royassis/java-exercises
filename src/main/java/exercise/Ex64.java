package exercise;

import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();

        if (a < 25 | a > 75 | b < 25 | b > 75) {
            System.out.println("err");
            System.exit(1);
        }
        while (a > 0) {

            while (b > 0) {
                if (a % 10 == b % 10) {
                    System.out.println("true");
                    System.exit(1);
                }
                b = b / 10;
            }
            a = a / 10;
        }
        System.out.println("false");
        scanner.close();
    }
}
