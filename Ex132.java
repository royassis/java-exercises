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
        Integer tempCount = 0;
        int i= 0;
        int j= 0 ;
        
        while (i < arr.length){
            for (j=i; j<= arr.length;j++) {
                if (j==arr.length || arr[i] != arr[j]){
                    i = j ;
                    break;
                }
                else{
                    tempCount++;
                }
            }
            count = count + (tempCount > c ? c : tempCount);
            tempCount =0;
        }

        return count ;
    }
    


    public static void main(String[] args) {
        Integer[] arr = {1,2,3,3,3,4,4,5,6};
        System.out.println(String.format("Array: %s have %d unique numbers", Arrays.toString(arr), getSqueezedArrLength(arr, 2)));
    }
}