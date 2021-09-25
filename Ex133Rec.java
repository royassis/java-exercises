import java.util.ArrayList;

import MatrixPackage.*;

class Ex133Rec {
    public static void main(String[] args) {
        Matrix matrix = Matrix.generateRandomMatrix(3, 3, 1, 6);
        foo(matrix);

    }

    static Integer foo(Matrix matrix) { 
        ArrayList<MatrixEle> arrList = new ArrayList<MatrixEle>();
        arrList.add(new MatrixEle());
        return fooBase(matrix, new MatrixEle(), arrList);
    }

    static Integer fooBase(Matrix matrix, MatrixEle currentLocation, ArrayList<MatrixEle> arrList) {
        Integer resultsA = null;
        Integer resultsB = null;
        System.out.println(currentLocation);
        if (matrix.down(currentLocation) == null && matrix.right(currentLocation) == null) {
            return matrix.valueAtElement(currentLocation);

        }
        if (matrix.down(currentLocation) != null) {
            resultsA = matrix.valueAtElement(currentLocation) + fooBase(matrix, new MatrixEle(currentLocation).addY());

        }
        if (matrix.right(currentLocation) != null) {
            resultsB = matrix.valueAtElement(currentLocation) + fooBase(matrix, new MatrixEle(currentLocation).addX());
        }

        if (resultsA == null) {
            return resultsB;
        } else if (resultsB == null) {
            return resultsA;
        }
        return (resultsA > resultsB ? resultsB : resultsA);
    }

}
