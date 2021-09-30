package exercise;

// Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.

public class Ex156 {
    public static void main(String[] args) {
        Integer n = 2049;
        Integer nshifts = 0;

        do{
            n >>=1;
            nshifts++;
        }while(n > 0);

        System.out.println(nshifts-1);
    }

}
