package myexercises;


public class BinaryAdd {
    public static void main(String[] args) {

      System.out.println(binaryAdd(1, 1));
    }

    static Integer binaryAdd(int x, int y) {
        if (y == 0){
            return x ;
        }

        int tmp = y; 
        y =  (x & y) << 1 ;
        x =  (x ^ tmp) ;
        return binaryAdd(x, y);
    }

}
