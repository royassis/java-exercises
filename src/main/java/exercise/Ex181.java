package exercise;

import java.util.Arrays;

public class Ex181 {

    public static void main(String[] args) {
        String s = "hello there general a";

        String[] strArr = s.split(" ");

        s = Arrays.stream(strArr).max((x,y)->{
            if(x.length() > y.length()){
                return 1;
            }else{
                return -1;
            }
        }).get();

        System.out.println(s);

    }
}
