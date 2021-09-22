import java.util.Scanner;
import java.util.*;
import java.util.function.Predicate;

public class Ex79
{  
    public static void main(String[] args){
        Integer[] arr = {10,2,3,4,5,1};
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(arr));
        
        for (Integer n : rotateLeft(arr2)){
            System.out.print(n+" ");
        }
        
    }
    static ArrayList<Integer> rotateLeft(ArrayList<Integer> inputList){
        ArrayList<Integer> shiftedList = new ArrayList();
        for (int i =1; i<inputList.size(); i++){
            shiftedList.add(inputList.get(i));     
        }
        shiftedList.add(inputList.get(0));
        
        return shiftedList;
    }
        static Integer[] rotateLeft(Integer[] inputArr){
        Integer[] shiftedArr = new Integer[inputArr.length];
        for (Integer i =0; i<inputArr.length-1; i++){
            shiftedArr[i]= inputArr[i+1];   
        }
        shiftedArr[shiftedArr.length-1] = inputArr[0];
        
        return shiftedArr;
    }
}