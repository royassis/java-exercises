public class Ex98 {
    public static void main(String[] args) {

        int n = 20;
        int counter = 0;
        int target = 2;
        int[] arr = { 20, 0, 20 };
        int i;

        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] == n && arr[i] == arr[i+1]) {
                System.out.println(n+"'s next to each other");
                System.exit(0);
            }
            if (arr[i] == n) {
                counter++;
            }
        }
        if (arr[i++] == n) {
            counter++;
        }


        if (counter == target) {
            System.out.println("Exactly "+target+" "+n+"'s");
        } else {
            System.out.println("Not enough "+n+"'s");
        }
    }
}
