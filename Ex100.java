public class Ex100 {
    public static void main(String[] args) throws InterruptedException{
        int[] arr1 = {4,5,3};
        int[] arr2 = {3,6,5};
        int cnt =0;

        for(int i=0 ; i< arr1.length; i++){
            if (Math.abs(arr1[i] - arr2[i]) == 1){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
