package exercise;

public class Ex97 {
    public static void main(String[] args) {
        int n = 20;
        int[] arr = {20, 20, 20};
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == n && (arr[i] == arr[i + 1] | arr[i] == arr[i + 2])) {
                System.out.println("found it");
                System.exit(0);
            }
        }
        System.out.println("No good");
    }
}
