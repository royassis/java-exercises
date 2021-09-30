package exercise;

// Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.

public class Ex157 {
    public static void main(String[] args) {
        Integer n = 252;
        Integer m = 105;

        while (n != m) {
            if (m > n) {
                m -= n;
            } else if (m < n) {
                n -= m;
            }
        }

        System.out.println(foo(252, 105));
    }

    static Integer foo(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }

        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (a % b == 0) {
            return b;
        } else {
            return foo(b, a % b);
        }
    }

}
