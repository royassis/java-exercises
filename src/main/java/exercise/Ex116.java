package exercise; 
import java.util.HashMap;

public class Ex116 {
    
  
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(3, "fizz");
        hashMap.put(5, "buzz");
        Boolean flag = false;

        Integer n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            flag = false;
            for (Integer key : hashMap.keySet()){
                if (i%key ==0 ){
                    System.out.print(hashMap.get(key) +" ");
                    flag=true;
                }
            }
            if (flag){
                System.out.print("\n");
            }
            
        }
    }
}