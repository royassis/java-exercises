package exercise;

public class Ex115 {
    public static void main(String[] args) {

        Integer n = 0;
        try {
            n = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.exit(1);
        }


        Integer nDigits = getDigitsNumberFromInteger(n);

        for (int i = 0; i < nDigits / 2; i++) {
            if (getNthDigitFromInteger(n, i + 1) != getNthDigitFromInteger(n, nDigits - i)) {
                System.out.println("No good");
                System.exit(1);
            }
        }
        System.out.println("good");
    }

    static Integer getNthDigitFromInteger(Integer n, double p) {
        return (int) (n / Math.pow(10.0, p - 1.0)) % 10;
    }

    static Integer getDigitsNumberFromInteger(Integer n) {
        Integer counter = 0;
        while (n > 0) {
            n /= 10;
            counter++;
        }
        return counter;
    }


}