package MatrixPackage;

import java.util.ArrayList;
import java.util.HashMap;

public class Matrix {
    Integer[][] matrix;
    Integer c;
    Integer r;

    public Matrix(Integer[][] newMatrix) {
        matrix = newMatrix;
        r = newMatrix.length;
        c = newMatrix[0].length;
    }
    

    public static Matrix generateRandomMatrix(Integer r, Integer c, Integer min, Integer max) {
        Integer[][] matrix = new Integer[r][c];

        for (int i = 0; i < r * c; i++) {
            matrix[i / c][i % c] = Utils.getRandomNumber(min, max);
        }
        return new Matrix(matrix);
    }

    public HashMap<String,MatrixEle> allValidInProximity(Integer i, Integer j) {
        HashMap<String,MatrixEle> hashMap = new HashMap();
        hashMap.put("up", up(i));
        hashMap.put("down", down(i));
        hashMap.put("left", left(i));
        hashMap.put("right", right(i));
        return hashMap;
    }

    public MatrixEle up(Integer i) {
        MatrixEle matrixEle = indexToTwo(i);
        MatrixEle newMatrixEle = new MatrixEle(matrixEle);
        newMatrixEle.reduceY();
        return directionBase(newMatrixEle, matrixEle);
    }

    public MatrixEle down(Integer i) {
        MatrixEle matrixEle = indexToTwo(i);
        MatrixEle newMatrixEle = new MatrixEle(matrixEle);
        newMatrixEle.addY();
        return directionBase(newMatrixEle, matrixEle);
    }

    public MatrixEle left(Integer i) {
        MatrixEle matrixEle = indexToTwo(i);
        MatrixEle newMatrixEle = new MatrixEle(matrixEle);
        newMatrixEle.reduceX();
        return directionBase(newMatrixEle, matrixEle);
    }

    public MatrixEle right(Integer i) {
        MatrixEle matrixEle = indexToTwo(i);
        MatrixEle newMatrixEle = new MatrixEle(matrixEle);
        newMatrixEle.addX();
        return directionBase(newMatrixEle, matrixEle);
    }

    public MatrixEle directionBase(MatrixEle matrixEleNew, MatrixEle matrixEleBase) {
        if (isIndexValid(matrixEleNew) && isIndexValid(matrixEleBase)) {
            return matrixEleNew;
        }
        return null;
    }

    public Boolean isIndexValid(Integer i) {
        MatrixEle matrixEle = indexToTwo(i);
        return isIndexValid(matrixEle);
    }

    public Boolean isIndexValid(MatrixEle matrixEle) {
        return !(matrixEle.getX() >= r | matrixEle.getY()  >= c |matrixEle.getX() < 0 | matrixEle.getY() < 0);
    }

    public MatrixEle indexToTwo(Integer i) {
        return new MatrixEle(i / c, i % c );
    }

    public Integer TwoToOneIndex(Integer i, Integer j) {
        return TwoToOneIndex(i, j, r);
    }

    static public Integer TwoToOneIndex(Integer i, Integer j, Integer r) {
        return r * i + j;
    }

    public String toString()  {

        String str ="";
        for (int i = 0; i < r * c; i++) {
            str = str + this.matrix[i / c][i % c] + " ";
            if ((i % c) == c - 1) {
                str = str +"\n";
            }
        }
        return str.substring(0, str.length()-1);
    }
}
