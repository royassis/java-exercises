package exercise;

import java.util.*;

import matrixpackge.*;

class Ex136 {
    public static void main(String[] args) {
        Matrix matrix = Matrix.generateRandomMatrix(3, 4, 1, 6);
        System.out.println(matrix);

        System.out.println(getMinPathSumOfMatrix(matrix));
        for (ArrayList<MatrixEle> c : getAllMatrixPaths(matrix)) {
            System.out.println(c);
        }

        System.out.println();
        for (Object c : foo(matrix)) {
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

    static ArrayList<Object> foo(Matrix matrix) {
        ArrayList<Object> arrList = new ArrayList<Object>();
        arrList.add(new ArrayList<MatrixEle>());
        fooBase(matrix, new MatrixEle(), arrList, 0);
        return arrList;
    }

    static void fooBase(Matrix matrix, MatrixEle currentLocation, ArrayList<Object> arrList, Integer loc) {


        ((ArrayList<MatrixEle>) arrList.get(loc)).add(currentLocation);

        if (matrix.down(currentLocation) == null && matrix.right(currentLocation) == null) {
            return;
        }

        int a = loc;
        int b = loc;
        if (matrix.right(currentLocation) != null && matrix.down(currentLocation) != null) {
            ArrayList<Object> newArr = new ArrayList<Object>((ArrayList<Object>) arrList.get(loc));
            arrList.add(newArr);
            b = arrList.size() - 1;
        }

        if (matrix.down(currentLocation) != null) {
            fooBase(matrix, new MatrixEle(currentLocation).addY(), arrList, a);
        }
        if (matrix.right(currentLocation) != null) {
            fooBase(matrix, new MatrixEle(currentLocation).addX(), arrList, b);
        }

    }

}
