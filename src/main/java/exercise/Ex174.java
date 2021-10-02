package exercise;


public class Ex174 {

    public static void main(String[] args) {
        Integer[] arrA = { 6, 4, 5, 3, 5, 5, 6 , 1, 1, 1, 1};

        int k = 4;

        for (int i = 0; i < arrA.length - k + 1; i++) {
            int max = arrA[i];

            for(int j = i; j< i+k; j ++){
                if(arrA[j] > max){
                    max = arrA[j];
                }
            }

            System.out.println(max);
        }
    }
}
