package exercise;
import java.util.Scanner;

public class Ex65
{
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer numerator = scanner.nextInt();
        Integer denominator = scanner.nextInt();
        
        Integer quoitent = numerator/denominator;
        Integer reminder = numerator - quoitent*denominator;
        
        System.out.println (reminder);
        
        scanner.close();
   }
}
