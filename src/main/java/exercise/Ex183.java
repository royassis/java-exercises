package exercise;

import java.util.Scanner;

public class Ex183 {

    public static void main(String[] args) {

        int n;
        System.out.println("Please enter a number:");
        try(Scanner scanner = new Scanner(System.in)){
            n = scanner.nextInt();
        }
        
        int sum = 0;

        while (n > 0){
            sum += n%10;
            n /=10;
        }

        System.out.println(sum);

    }
}
