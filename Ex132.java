import java.util.Arrays;

// Write a Java program to get the preorder traversal of its nodes' values of a given a binary tree


public class Ex132 {
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
    public static Integer getSqueezedArrLength(Integer[] arr, Integer c){
        Integer count =0;
        Integer last = arr[1];
        Integer tempCount =1;

        for (Integer n: arr){
            if (n!=last){
                tempCount = tempCount >= c ? c : tempCount;
                count = count + tempCount;
                tempCount =1;
            }else{
                tempCount ++;
            }
            last = n; 
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,3,3,4,5,6 , 7};
        System.out.println(String.format("Array: %s have %d unique numbers", Arrays.toString(arr), getSqueezedArrLength(arr, 2)));
    }
}