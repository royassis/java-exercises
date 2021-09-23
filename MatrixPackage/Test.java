package MatrixPackage;

import java.util.HashMap;

class Test {
    public static void main(String[] args) {
        Matrix matrix = Matrix.generateRandomMatrix(3, 4, 0, 6);
        System.out.println(matrix+ "\n");

        Integer n = 11;
        System.out.println("current index: " + matrix.indexToTwo(n));
        System.out.println("right: " + matrix.right(n));
        System.out.println("left: " + matrix.left(n));
        System.out.println("up: " + matrix.up(n));
        System.out.println("down: " + matrix.down(n));

        HashMap<String, MatrixEle> hashMap = matrix.allValidInProximity(0, 0);

        System.out.println("");
        System.out.println(hashMap);
    }
}