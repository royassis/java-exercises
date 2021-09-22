import java.util.*;

// Write a Java program to calculate the median of a given unsorted array of integers
public class Ex128 {
    public static void main(String[] args) {
        Integer min = Integer.parseInt(args[0]);
        Integer max = Integer.parseInt(args[1]);
        Integer size = Integer.parseInt(args[2]);

        Integer[] arr = getRandomArr(size, min, max);
        System.out.println(String.format("The median of %s is %d", Arrays.toString(arr), getMedian(arr)));
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
    public static Integer getMedian(Integer[] arr){
        int mid = arr.length / 2;
        if (arr.length % 2==0){
            
            return (arr[mid] + arr[mid-1])/2;
        }
        return arr[mid];
    }
}