//Write a Java program to compute the square root of a given integer

package exercise;

public class Ex117 {
    public static void main(String[] args) {
        Integer numberSquared = Integer.parseInt(args[0]);
        int start = 0;
        int end = numberSquared;
        int counter = 0;
        while (start <= end) {
            int middle = (start + end) / 2;
            int middleSquared = middle * middle;

            System.out.println(String.format("%d-- start: %d end: %d middle: %d", counter + 1, start, end, middle));
            if (middleSquared == numberSquared) {
                System.out.println(String.format("The root of %d is %d", numberSquared, middle));
                System.exit(0);
            } else if (middleSquared < numberSquared) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
            counter++;
        }

    }

}