package exercise;

public class Ex111 {
    public static void main(String[] args) {
        Integer x = 2;
        Integer y = 7;
        Integer c = 0;

        while (y > 0) {
            c = x & y;
            x = x ^ y;
            y = c << 1;
        }
        System.out.println(x);

    }
}