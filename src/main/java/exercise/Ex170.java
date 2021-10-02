package exercise;

public class Ex170 {

    public static void main(String[] args) {

        Integer[] arr = { 1, 2, 3, 1, 2, 3, 4, 5, 6 };

        int last = arr[0] + 1;
        int cnt = 1;
        int maxCount = 1;

        for (int x : arr) {
            if (x - 1 == last || x == last) {
                cnt++;
            } else {
                if (cnt > maxCount) {
                    maxCount = cnt;
                }
                cnt = 1;
            }
            last = x;
        }

        if (cnt > maxCount) {
            maxCount = cnt;
        }
        System.out.println(maxCount);
    }
}
