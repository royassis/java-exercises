package exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;


class Comp implements Comparator<Integer>{
    public int compare(Integer x, Integer y){
        if (x<0 && y> 0){
            return -1;
        }else if (x>0 && y< 0){
            return 1;
        }else{
            return 0;
        }
    }
}

public class Ex165 {
    public static void main(String[] args) {
        Integer[] arr = {1,-1,-2,-3,3,5,4, -9};

        System.out.println(Arrays.stream(arr).sorted(new Comp()).collect(Collectors.toList()));
    }
}
