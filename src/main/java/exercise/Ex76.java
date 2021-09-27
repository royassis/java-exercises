package exercise;

public class Ex76 {
    public static void main(String[] args) {
        Integer[] arr = {10, 1, 10};
        Integer[] arr2 = {10, 1, 12};

        System.out.println(testArrays(arr, arr2));

    }

    public static boolean testArrays(Integer[] arr, Integer[] arr2) {
        return arr.length >= 2 && arr2.length >= 2 && arr[0] == arr2[arr2.length - 1];
    }
}