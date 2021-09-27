package exercise; 

public class Ex110 {
    public static void main(String[] args) {
        Integer n = 64;
        Integer m = 4;
        double result = (Math.log10(n) / Math.log10(m));
        double resultAsInt = (int) result;
        System.out.println(result == resultAsInt);
    }

}
