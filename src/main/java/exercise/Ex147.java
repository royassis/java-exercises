package exercise;


// Write a Java program to find the number of bits required to flip to convert two given integers.

public class Ex147 {
    public static void main(String[] args) {
        Integer n = 4;
        Integer m = 7;

        // Option A - my solution
        Integer xor = n^m;
        Integer cnt = 0;

        while (xor > 0){
            if (xor%2 == 1){
                cnt++;
            }
            xor = xor /2;
        }

        // Option B - online solution
        int ctr = 0;
        for (int z = n ^ m; z != 0; z = z >>> 1) {
            ctr += z & 1;
        }

        System.out.println(cnt);
        System.out.println(ctr);
    }

}
