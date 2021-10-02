package exercise;


public class Ex166 {

    public static void main(String[] args) {

        System.out.println(intToString(-12));
    }

    static String intToString(Integer x){
        String minus = x < 0? "-" : "";
        x = Math.abs(x);
        StringBuilder tsb = new StringBuilder();
        
        while(x > 0){
            tsb.append(x%10 );  
            x = x/10;  
        }

        tsb.append(minus);
        return tsb.reverse().toString();
    }
}
