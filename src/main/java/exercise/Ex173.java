package exercise;


public class Ex173 {

    public static void main(String[] args) {
        Integer[] arrA = { 1, 2, 3, 4, 5, 6 };

        int k = 4;

        for (int i = 0; i < arrA.length - k + 1; i++) {
            int j = (2 * i + k) / 2;
            if (k % 2 == 0) {
                System.out.println((double) (arrA[j - 1] + arrA[j]) / 2);
            } else {
                System.out.println(arrA[j]);
            }
        }
    }
}
