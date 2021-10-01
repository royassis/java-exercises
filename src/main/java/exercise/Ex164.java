package exercise;

public class Ex164 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int cnt = 0;
        
        while (a> b){
            a = a-b;
            cnt ++;
        }

        System.out.println(cnt+1);
    }
}
