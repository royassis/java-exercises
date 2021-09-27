package exercise;

public class Ex94 {
    public static void main(String[] args) throws InterruptedException{
        int[] arr = {1,5,5,2,3,10,11,22,99};
        boolean flag = true;

        while (flag){
            flag = false;
            for (int i=0; i<arr.length-1; i++){
                if (arr[i]%2==0 && arr[i+1]%2==1){
                    switcher(arr, i, i+1);
                    flag = true;
                }
            }
        }

        printArr(arr);
        
    }
    public static void switcher(int[] arr, int idxA, int idxB ){
        int tmp = arr[idxA];
        arr[idxA] = arr[idxB];
        arr[idxB] = tmp;
    }
    public static void printArr(int[] arr){
        for (int n : arr){
            System.out.print(n+" ");
        }
        System.out.print("\n");
    
    }
}
