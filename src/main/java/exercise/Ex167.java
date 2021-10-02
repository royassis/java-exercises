package exercise;


import java.util.Arrays;

public class Ex167 {

    static void sortArr(int[] arr){

        int flag;
        do{
            flag = 1;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] == 0 && arr[i+1] != 0){
                    swap(arr, i, i+1);
                    flag = 0;
                }
            }
            
        }while(flag == 0);
    }
    static  void swap(int[] arr, int i, int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,0,2,2,2,3};

        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
