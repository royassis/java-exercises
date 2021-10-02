package exercise;

import static utils.Utils.getNumberLength;
import static utils.Utils.getNthDigit;


public class Ex186 {

    public static void main(String[] args) {
        Integer a = 100;
        
        System.out.println(solution(a));

    }
    static Boolean solution(int a){
        int nDigits = getNumberLength(a);

        
        for (int i =0; i < nDigits/2; i++){
            int x = getNthDigit(a, i+1);
            int y = getNthDigit(a, nDigits-i);

            if (x != y){
                return false;
            }
        }
        return true;
    }
}
