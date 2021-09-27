package exercise; 

public class Ex112 {
    public static void main(String[] args) {
        Integer n = Integer.parseInt(args[0]);
        System.out.println(factorialTrailingZeros(n));

    }

    public static long factorialTrailingZeros(Integer n) {
		long ctr = 0;
		while (n != 0) 
		{
			ctr += n / 5;
			n /= 5;
		}
        return ctr;
    }
}