import java.util.HashMap;
public class Ex102 {
    public static void main(String[] args) throws InterruptedException{
        int[] arr = {30,5,10};
        int[] requested = {10,30};
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        for(int n: arr){
            hashMap.merge(n, 1, Integer::sum);
        }

        int counter =0;
        for (int n: requested){
            counter = counter + hashMap.getOrDefault(n,0);
        }

        System.out.println(counter);
    }
}
