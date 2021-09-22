import java.util.*;
import java.lang.Math;
import java.lang.Runtime;

public class Ex63
{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Integer a =null;
        Integer b ;
        
        String stg;
        
        while (true){
            System.out.print("Input the first number: ");
            stg = scanner.nextLine();
            if (stg == "End"){
                System.out.print(stg);
                System.out.print("Exiting");
                System.exit(0);
            }else{
                System.out.print("End" == stg);
                a = Integer.parseInt(stg);
            }
            
            
            System.out.print("Input the second number: ");
            b = scanner.nextInt();
            
            if (a==b){
                System.out.println(0);
            }else if(a%6 == b%6){
                System.out.println(Math.min(a,b));
            }else{
                System.out.println(Math.max(a,b));
            }
        
        }    
    }
}
