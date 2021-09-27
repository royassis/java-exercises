package exercise;
public class Ex74
{  
    public static void main(String[] args){
        Integer[] arr = {0,1,10};
        if (testArr(arr)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
    public static boolean testArr(Integer[] arr){
        if (arr.length >=2 && arr[arr.length-1]==10){
            return true;
        }else{
            return false;
        }
    }
}