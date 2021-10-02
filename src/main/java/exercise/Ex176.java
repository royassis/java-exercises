package exercise;

import java.util.Arrays;

public class Ex176 {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};

        Arrays.asList(arr).sort((x,y)-> {
            if(x%2 ==0 && y%2==1){
                return -1;
            }else{
                return 1;
            }
        });

        System.out.println(Arrays.toString(arr));

    }
}
