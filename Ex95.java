public class Ex95 {
    public static void main(String[] args) throws InterruptedException{
        final int n = 9;
        String[] arr= new String[n];
        for (int i=0; i<n ; i++){
            arr[i] = Integer.toString(i);
        }
        System.out.println(String.join(" ",arr));
    }
}
