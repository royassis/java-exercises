import java.util.*;

import MatrixPackage.*;

class Ex133Rec {
    public static void main(String[] args) {
        Matrix matrix = Matrix.generateRandomMatrix(2, 2, 1, 6);
        System.out.println(matrix);
        foo(matrix);

    }

    static void foo(Matrix matrix) { 
        Deque<MatrixEle> deque1 = new LinkedList<MatrixEle>();
        Deque<MatrixEle> deque2 = new LinkedList<MatrixEle>();

        ArrayList<ArrayList<MatrixEle>> arrList = new ArrayList<ArrayList<MatrixEle>> ();
        arrList.add(new ArrayList<MatrixEle>());
        fooBase(matrix, new MatrixEle(), arrList, 0);
        System.out.println(arrList);
    }

    static Integer fooBase(Matrix matrix, MatrixEle currentLocation, ArrayList<ArrayList<MatrixEle>> arrList, int loc) {
        Integer resultsA = null;
        Integer resultsB = null;

        arrList.get(loc).add(currentLocation);

        if (matrix.down(currentLocation) == null && matrix.right(currentLocation) == null) {
            return matrix.valueAtElement(currentLocation);
        }
  
        int a = loc;
        int b = loc + 1;
        if (matrix.right(currentLocation) == null || matrix.down(currentLocation) == null ){
            b = loc;
        }
        if (matrix.right(currentLocation) != null && matrix.down(currentLocation) != null ){
            arrList.add(new ArrayList<>(arrList.get(loc)));
        }
        
        if (matrix.down(currentLocation) != null) {
            resultsA = matrix.valueAtElement(currentLocation) + fooBase(matrix, new MatrixEle(currentLocation).addY(), arrList, a);
        }
        if (matrix.right(currentLocation) != null) {
            resultsB = matrix.valueAtElement(currentLocation) + fooBase(matrix, new MatrixEle(currentLocation).addX(), arrList, b);
        }
        
        if (resultsA == null) {
            return resultsB;
        } else if (resultsB == null) {
            return resultsA;
        }
        
        return (resultsA > resultsB ? resultsB : resultsA);
    }

}
