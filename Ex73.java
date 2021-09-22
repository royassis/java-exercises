import java.util.Scanner;

public class Ex73
{  
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        String stringA = inputScanner.nextLine();
        String stringB = inputScanner.nextLine();
        String out = "";
        if (stringA.length() == 0  ){
            stringA = "#";
        }else{
            stringA = stringA.substring(0,1);
        }
        
        if (stringB.length() == 0  ){
            stringB = "#";
        }else{
            stringB = stringB.substring(stringB.length()-1);
        }
        System.out.println(stringA+stringB);
    }
}