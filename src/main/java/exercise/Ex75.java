package exercise;
public class Ex75
{  
    public static void main(String[] args){
        Integer[] arr = {10,1,10};
        if (testArr(arr)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
    public static boolean testArr(Integer[] arr){
        if (arr.length >=2 && arr[arr.length-1]==arr[0]){
            return true;
        }else{
            return false;
        }
    }
}