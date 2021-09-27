package exercise;
import java.util.*;

import matrixpackge.*;

class Ex137 {
    public static void main(String[] args) {
        Integer[][]  a = new Integer[][] {new Integer[] {0,0,0},
                                          new Integer[] {0,1,0},
                                          new Integer[] {0,0,0}};
        Matrix matrix = new Matrix(a);
        System.out.println(matrix);

        for (ArrayList<MatrixEle> c : getAllMatrixPaths(matrix)) {
            System.out.println(c);
        }

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
  
        if (!customIsValid(currentLocation.getNextEle(0,1), matrix) && !customIsValid(currentLocation.getNextEle(1,0), matrix)) {
            return;
        }

        int a = loc;
        int b = loc;
        if (customIsValid(currentLocation.getNextEle(1,0), matrix) && customIsValid(currentLocation.getNextEle(0,1), matrix)) {
            arrList.add(new ArrayList<>(arrList.get(loc)));
            b = arrList.size() - 1;
        }

        if (customIsValid(currentLocation.getNextEle(0,1), matrix)) {
            getAllMatrixPathsBase(matrix, new MatrixEle(currentLocation).addY(), arrList, a);
        }
        if (customIsValid(currentLocation.getNextEle(1,0), matrix)) {
            getAllMatrixPathsBase(matrix, new MatrixEle(currentLocation).addX(), arrList, b);
        }

    }
    
    static Boolean customIsValid(MatrixEle location, Matrix matrix){
        return matrix.isIndexValid(location) && matrix.valueAtElement(location) != 1;
    }

}
