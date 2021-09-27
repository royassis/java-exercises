package exercise;

public class Ex92 {
    public static void main(String[] args) {
        int[] arr = java.util.stream.IntStream.rangeClosed(0, 10).toArray();
        Integer even=0;
        Integer odd=0;

        for (Integer n : arr){
            if (n%2==0){
                even ++;
            }else{
                odd++;
            }
        }
        System.out.println("even: "+even+" odd: "+odd);
    }
}