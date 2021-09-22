import java.util.Scanner;
import java.util.*;
import java.util.function.Predicate;

public class Ex80
{  
    public static void main(String[] args){
        Integer[] arr = {10,2,3,4,5,1};
        System.out.println(Math.max(arr[0],arr[arr.length-1]));
    }
}