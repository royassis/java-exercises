import java.util.Scanner;
import java.util.*;
import java.util.function.Predicate;

public class Ex78
{  
    public static void main(String[] args){
        Integer[] arr = {10,1};
        Integer[] arr2 = {4,10};

        
        for (Integer n : arr){
             if (Arrays.stream(arr2).anyMatch(n::equals)){
                 System.out.println(true);
             }
        }
    }
}