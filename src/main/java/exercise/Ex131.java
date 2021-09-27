package exercise;
import java.util.Arrays;

// Write a Java program to get the preorder traversal of its nodes' values of a given a binary tree


public class Ex131 {
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
    public static Integer getSqueezedArrLength(Integer[] arr){
        Integer count =0;
        Integer last = arr[1];
        for (Integer n: arr){
            if (n!=last){
                last = n;
                count++;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,3,3,4,5,6,7,7, 8};
        System.out.println(String.format("Array: %s have %d unique numbers", Arrays.toString(arr), getSqueezedArrLength(arr)));
    }
}