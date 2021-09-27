package exercise;
import java.util.Scanner;
import java.util.*;

public class Ex87 {
    public static void main(String[] args) {

        int n;
        int m;
        int sum = 0;
        Integer length = 0;

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0, "zero");
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        hashMap.put(6, "six");
        hashMap.put(7, "seven");
        hashMap.put(8, "eight");
        hashMap.put(9, "nine");

        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
        };

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        length = getNumberLength(sum);
        while (length >= 1) {
            m = getNthDigit(sum, length);
            System.out.println(hashMap.get(m));
            length--;
        }
    }

    static Integer getNthDigit(Integer n, Integer digit){
        return (int) ((n / Math.pow(10, digit - 1)) % 10);
    }

    static Integer getFirstDigit(Integer n, Integer length){
        return getNthDigit(n, length);
    }

    static Integer getFirstDigit(Integer n){
        Integer length =0;
        while (n > 0) {
            length++;
            n = n / 10;
        }

        return (int) ((n / Math.pow(10, length - 1)) % 10);
    }

    static Integer getNumberLength(Integer n){
        Integer length = 0;
        while (n > 0) {
            length++;
            n = n / 10;
        }
        return length;
    }

}
