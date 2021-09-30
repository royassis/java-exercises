package exercise;

// Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.

public class Ex155 {
    public static void main(String[] args) {
        Integer[][] arr = { { 1, 2, 3 },
                            { 4, 5, 6 } 
                          };

        Integer r = arr.length;
        Integer c = arr[0].length;

        Integer[][] arr2 = new Integer[c][r];

        for (int i = 0; i < c * r; i++) {
            arr2[i%c][i/c] = arr[i/c][i%c];
        }

        for (int i = 0; i < c * r; i++) {
            System.out.print (String.format("%d ", arr2[i%c][i/c]));
            if (i%r == r-1){
                System.out.println();
            }
        }

        System.out.println();

    }

}
