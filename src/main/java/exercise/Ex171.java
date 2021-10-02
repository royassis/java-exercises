package exercise;

public class Ex171 {

    public static void main(String[] args) {
        String a = "1";
        String b = "a1";

        System.out.println(isStringContained(a, b));

    }

    static Boolean isStringContained(String a, String b) {
        int i = 0;
        int j = 0;

        while (j < b.length() && i < a.length()) {

            if (a.charAt(i) == b.charAt(j)) {
                i++;
            } else {
                i = 0;
            }
            j++;

        }

        return i == a.length();

    }
}
