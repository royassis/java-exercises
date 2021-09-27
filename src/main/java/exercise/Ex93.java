package exercise;

public class Ex93 {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {10, 10, 20, 20};
        Boolean ten = false;
        Boolean twenty = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 10 && arr[i] == 10) {
                ten = true;
            } else if ((arr[i] == 20 && arr[i] == 20)) {
                twenty = true;
            }
            if (ten && twenty) {
                System.out.println("no good");
            }
        }

        if (ten ^ twenty) {
            System.out.println("great");
        } else {
            System.out.println("no good");
        }
    }
}
