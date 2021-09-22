import java.util.Scanner;
import java.util.*;
import java.util.function.Predicate;

public class Ex84
{  
    public static void main(String[] args){
        String s= "Python";
        String last = s.substring(s.length()-3);
        System.out.println(last+s+last);
    }
}
