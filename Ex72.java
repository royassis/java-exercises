import java.util.Scanner;

public class Ex72
{  
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        String stringA = inputScanner.nextLine();
        String out = "";
        if (stringA.length() <3 ){
            for (int i=0; i< stringA.length() ; i++){
                out = out +"#";
            }
            System.out.println(out);
        }else{
            System.out.println(stringA.substring(0,3));
        }
        inputScanner.close();
    }
}