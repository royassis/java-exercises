package exercise;

public class Ex74 {
    public static void main(String[] args) {
        Integer[] arr = {0, 1, 10};
        System.out.println(testArr(arr));

    }

    public static boolean testArr(Integer[] arr) {
        return arr.length >= 2 && arr[arr.length - 1] == 10;
    }
}