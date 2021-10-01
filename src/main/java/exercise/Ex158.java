package exercise;

// Write a Java program to create a two-dimension array (m x m) A[][] such that A[i][j] is true if I and j are prime and have no common factors, otherwise A[i][j] becomes false;

public class Ex158 {
    public static void main(String[] args) {

        Boolean[][] arr = { { false, false, false }, { false, false, false }, { false, false, false } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = GCD(i, j) == 1;
                System.out.print(arr[i][j] + " ");
                if (j == arr[0].length - 1) {
                    System.out.println();
                }
            }
        }

    }

    // static Boolean isPrime(Integer x) {
    // return isPrimeBase(x, 3);
    // }

    // static Boolean isPrimeBase(Integer x, Integer y) {
    // if (x == 1) {
    // return true;
    // }

    // if (x % 2 == 0 || x % y == 0|| x ==0 ) {
    // return false;
    // }

    // if (y * 2 > x){
    // return true;
    // }

    // return isPrimeBase(x, y + 2);
    // }

    static Integer GCD(Integer x, Integer y) {
        return GCDbase(x, y);
    }

    static Integer GCDbase(Integer x, Integer y) {
        if (x == 1 || y == 1 || x == 0 || y == 0) {
            return 1;
        }

        if (x < y) {
            int tmp = x;
            x = y;
            y = tmp;
        }

        if (x % y == 0) {
            return y;
        }

        return GCDbase(y, x % y);
    }

}
