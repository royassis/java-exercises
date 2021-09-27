package exercise;
import java.util.Arrays;

// 124. Write a Java program to find the index of a value in a sorted array. If the value does not find return the index where it would be if it were inserted in order
public class Ex124 {
    public static void main(String[] args) {
        Integer ele = Integer.parseInt(args[0]);
        Integer min = Integer.parseInt(args[1]);
        Integer max = Integer.parseInt(args[2]);
        Integer size = Integer.parseInt(args[3]);

        Integer[] arr = getRandomArr(size, min, max);
        Arrays.sort(arr);

        System.out.println(String.format("Trying to find ele %d in %s", ele, Arrays.toString(arr)));
        System.out.println(String.format("Index in array is %d", getIndexInArr(arr, ele)));

    }


    public static Integer getIndexInArr(Integer[] arr, Integer ele){
        Integer start =0;
        Integer end = arr.length;
        Integer mid = (start+end)/2;
        if (ele > arr[end-1]){
            return end;
        }
        
        while (start<=end){
            mid = (start+end)/2;
            if (arr[mid] == ele){
                return mid;
            }else if(arr[mid] > ele){
                end = mid-1;
            }else{
                start = mid +1 ;
            }  
        }
        return mid + 1;
    }

    public static Integer getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static Integer[] getRandomArr(int size, int min, int max){
        Integer[] arr = new Integer[size];
        for (int i=0; i< size ; i++){
            arr[i] = getRandomNumber(min, max);
        }
        return arr;
    }

}