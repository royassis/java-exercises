package exercise;

public class Ex99 {
    public static void main(String[] args) {

        int n = 20;
        boolean any_pair_flag = false;
        int[] arr = {20, 20, 0, 20};

        if ((arr[0] == n && arr[1] != n) | (arr[arr.length - 1] == n && arr[arr.length - 2] != n)) {
            System.out.println("no good");
            System.exit(1);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == n && (arr[i] == arr[i + 1] | arr[i] == arr[i - 1])) {
                any_pair_flag = true;
            } else if (arr[i] == n && !(arr[i] == arr[i + 1] | arr[i] == arr[i - 1])) {
                System.out.println("no good");
                System.exit(1);
            }

        }

        if (any_pair_flag) {
            System.out.println("good");
        } else {
            System.out.println("no good");
        }
    }

    static boolean intComparator(int[] arr, int n, int... indices) {
        boolean result = false;
        for (int i : indices) {
            if (arr[i] == n) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
