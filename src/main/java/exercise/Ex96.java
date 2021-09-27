package exercise; 
 public class Ex96 {
    public static void main(String[] args) {
        boolean flag = false;
        int[] arr= {20,10,20};
        for (int n : arr){
            if (n==10){
                flag = true;
            }
            else if (n==20 && flag){
                System.out.println("found it");
                System.exit(0);
            }
        }
        System.out.println("No good");
    }
}
