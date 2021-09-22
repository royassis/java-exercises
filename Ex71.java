import java.util.Scanner;

public class Ex71
{  
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        String stringA = inputScanner.nextLine();
        String stringB = inputScanner.nextLine();
        
        if (stringA.length() <1 | stringB.length() <1){
            System.exit(1);
        }
        System.out.println(stringA.substring(1)+stringB.substring(1));
        
    }
}