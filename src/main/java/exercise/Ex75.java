package exercise;

public class Ex75 {
    public static void main(String[] args) {
        Integer[] arr = {10, 1, 10};
        System.out.println(testArr(arr));

    }

    public static boolean testArr(Integer[] arr) {
        return arr.length >= 2 && arr[arr.length - 1] == arr[0];
    }
}