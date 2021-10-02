package exercise;

public class Ex171 {

    public static void main(String[] args) {
        String a = "1111";
        String b = "101111";

        System.out.println(isStringContained(a, b));

    }

    static Boolean isStringContained(String a, String b) {
        int i = 0;
        int j = 0;

        while (j < b.length() && i < a.length()) {
            i = a.charAt(i) == b.charAt(j) ? i + 1 : 0;
            j++;
        }
        return i == a.length();
    }
}
