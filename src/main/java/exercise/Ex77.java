package exercise;
import java.util.ArrayList;

public class Ex77
{  
    public static void main(String[] args){
        Integer[] arr = {10,1,10};
        Integer[] arr2 = {10,1,12};
        
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        arr3.add(arr[0]);
        arr3.add(arr2[arr2.length-1]);
        
        for (Integer n : arr3){
             System.out.print(n + " ");
        }
    }
}