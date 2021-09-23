public class Ex66
{
    public static void main(String[] args){
        
        Integer sum=1;
        Integer counter =0;
        Integer n =0;
        while (counter < 100){
            if (isPrimary(n)){
                sum = sum + n;
                counter++;
            }
            n++;
        }
        System.out.println(sum);
        
    }
    static boolean isPrimary(Integer n){
        if (n%2==0){
            return false;
        }
        for (int i=3; i <n; i=i+2){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
