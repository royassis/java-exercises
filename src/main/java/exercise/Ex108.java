package exercise; 

public class Ex108 {
    public static void main(String[] args) throws InterruptedException {
        Integer n = 555555;

        while (n > 10) {
            n = sumDigits(n);
            System.out.println(n);
        }

    }

    static Integer sumDigits(Integer n) {
        Integer sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n /10;
        }
        return sum;
    }
}
