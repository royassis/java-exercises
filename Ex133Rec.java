import java.util.*;

import MatrixPackage.*;

class Ex133Rec {
    public static void main(String[] args) {
        Matrix matrix = Matrix.generateRandomMatrix(3, 3, 1, 6);
        System.out.println(matrix);
        // foo(matrix);
        fooBar(matrix);

    }

    static void foo(Matrix matrix) { 
        ArrayList<ArrayList<MatrixEle>> arrList = new ArrayList<ArrayList<MatrixEle>> ();
        arrList.add(new ArrayList<MatrixEle>());
        fooBase(matrix, new MatrixEle(), arrList, 0);

        for (ArrayList<MatrixEle> c :arrList){
            System.out.println(c);
        }
    }

    static Integer fooBase(Matrix matrix, MatrixEle currentLocation, ArrayList<ArrayList<MatrixEle>> arrList, int loc) {
        Integer resultsA = null;
        Integer resultsB = null;

        arrList.get(loc).add(currentLocation);

        if (matrix.down(currentLocation) == null && matrix.right(currentLocation) == null) {
            return matrix.valueAtElement(currentLocation);
        }
  
        int a = loc;
        int b = loc;
        if (matrix.right(currentLocation) == null || matrix.down(currentLocation) == null ){
            arrList.add(new ArrayList<>(arrList.get(loc)));
            b++;
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

    static void fooBar(Matrix matrix){
        ArrayList<ArrayList<MatrixEle>> arrList = new ArrayList<ArrayList<MatrixEle>> ();
        arrList.add(new ArrayList<MatrixEle>());
        fooBarBase(matrix, new MatrixEle(), arrList, 0);

        for (ArrayList<MatrixEle> c :arrList){
            System.out.println(c);
        }
    }

    static void fooBarBase(Matrix matrix, MatrixEle currentLocation, ArrayList<ArrayList<MatrixEle>> arrList, int loc) {

        arrList.get(loc).add(currentLocation);

        if (matrix.down(currentLocation) == null && matrix.right(currentLocation) == null) {
            return;
        }
  
        int a = loc;
        int b = loc;
        if (matrix.right(currentLocation) != null && matrix.down(currentLocation) != null ){
            arrList.add(new ArrayList<>(arrList.get(loc)));
            b = arrList.size()-1;
        }
        
        if (matrix.down(currentLocation) != null) {
            fooBarBase(matrix, new MatrixEle(currentLocation).addY(), arrList, a);
        }
        if (matrix.right(currentLocation) != null) {
            fooBarBase(matrix, new MatrixEle(currentLocation).addX(), arrList, b);
        }
    }
}
