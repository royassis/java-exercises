import java.util.Scanner;
import java.util.*;
import java.util.function.Predicate;

public class Ex82
{  
    public static void main(String[] args){
        Integer[] arr = {10,2,3,20,4,5,1};
        Integer n = Math.max(Math.max(arr[0],arr[arr.length-1]),arr[arr.length/2]);
        
        System.out.println(n);
    }
}