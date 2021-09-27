package exercise;

public class Ex105 {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {10, 10, 20, 55, 10, 10};
        int n = 2;
        int i = 0;
        boolean flag = true;

        for (; i < n; i++) {
            if (arr[i] != arr[arr.length - n + i]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
