package exercise;

public class Ex109 {
    public static void main(String[] args) {
        Integer n = 10;

        for (int i = 0; i < n; i++) {
            System.out.println(multipleString("*", i + 1));
        }

    }

    static String multipleString(String c, Integer n) {
        String out = "";
        for (int i = 0; i < n; i++) {
            out = out + c + " ";
        }
        return out;
    }
}
