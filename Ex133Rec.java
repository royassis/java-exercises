import java.util.*;

import MatrixPackage.*;

class Ex133Rec {
    public static void main(String[] args) {
        Matrix matrix = Matrix.generateRandomMatrix(3, 3, 1, 6);
        System.out.println(matrix);

        System.out.println(getMinPathSumOfMatrix(matrix));
        for (ArrayList<MatrixEle> c : getAllMatrixPaths(matrix)) {
            System.out.println(c);
        }

    }

    static Integer getMinPathSumOfMatrix(Matrix matrix) {
        return getMinPathSumOfMatrixBase(matrix, new MatrixEle());
    }

    static Integer getMinPathSumOfMatrixBase(Matrix matrix, MatrixEle currentLocation) {
        Integer resultsA = null;
        Integer resultsB = null;

        if (matrix.down(currentLocation) == null && matrix.right(currentLocation) == null) {
            return matrix.valueAtElement(currentLocation);
        }

        if (matrix.down(currentLocation) != null) {
            resultsA = matrix.valueAtElement(currentLocation)
                    + getMinPathSumOfMatrixBase(matrix, new MatrixEle(currentLocation).addY());
        }
        if (matrix.right(currentLocation) != null) {
            resultsB = matrix.valueAtElement(currentLocation)
                    + getMinPathSumOfMatrixBase(matrix, new MatrixEle(currentLocation).addX());
        }

        if (resultsA == null) {
            return resultsB;
        } else if (resultsB == null) {
            return resultsA;
        }

        return (resultsA > resultsB ? resultsB : resultsA);
    }

    static ArrayList<ArrayList<MatrixEle>> getAllMatrixPaths(Matrix matrix) {
        ArrayList<ArrayList<MatrixEle>> arrList = new ArrayList<ArrayList<MatrixEle>>();
        arrList.add(new ArrayList<MatrixEle>());
        getAllMatrixPathsBase(matrix, new MatrixEle(), arrList, 0);

        return arrList;
    }

    static void getAllMatrixPathsBase(Matrix matrix, MatrixEle currentLocation, ArrayList<ArrayList<MatrixEle>> arrList,
            int loc) {

        arrList.get(loc).add(currentLocation);

        if (matrix.down(currentLocation) == null && matrix.right(currentLocation) == null) {
            return;
        }

        int a = loc;
        int b = loc;
        if (matrix.right(currentLocation) != null && matrix.down(currentLocation) != null) {
            arrList.add(new ArrayList<>(arrList.get(loc)));
            b = arrList.size() - 1;
        }

        if (matrix.down(currentLocation) != null) {
            getAllMatrixPathsBase(matrix, new MatrixEle(currentLocation).addY(), arrList, a);
        }
        if (matrix.right(currentLocation) != null) {
            getAllMatrixPathsBase(matrix, new MatrixEle(currentLocation).addX(), arrList, b);
        }

    }
}
