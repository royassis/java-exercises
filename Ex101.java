import java.util.HashMap;
public class Ex101 {
    public static void main(String[] args) throws InterruptedException{
        int[] arr = {20,5,10};
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        for(int n: arr){
            hashMap.merge(n, 1, Integer::sum);
        }


        boolean compareTens = hashMap.getOrDefault(10,0) > hashMap.getOrDefault(20,0) ? true : false; 
        System.out.println(compareTens);
    }
}
