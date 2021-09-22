import java.util.Scanner;

public class Ex76
{  
    public static void main(String[] args){
        Integer[] arr = {10,1,10};
        Integer[] arr2 = {10,1,12};
        
        if (testArrays(arr, arr2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
    public static boolean testArrays(Integer[] arr, Integer[] arr2){
        if (arr.length >=2 && arr2.length >=2 && arr[0]==arr2[arr2.length-1]){
            return true;
        }else{
            return false;
        }
    }
}