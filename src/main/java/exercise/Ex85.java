package exercise;


public class Ex85
{   
    static final String word = "Python";
    public static void main(String[] args){
        String s= "Python Roy";
        String first = s.split(" ")[0];
        if (first.equals(word)){
            System.out.println(true);
        }
    }
}