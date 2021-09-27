package matrixpackge;

import java.util.HashMap;
import java.util.Iterator;

import utils.Utils;

public class Matrix {
    Integer[][] matrix;
    Integer c;
    Integer r;
    Integer size;

    public Matrix(Integer[][] newMatrix) {
        matrix = newMatrix;
        r = newMatrix.length;
        c = newMatrix[0].length;
        size = c * r;
    }

    public Integer getSize() {
        return this.size;
    }

    public static Matrix generateRandomMatrix(Integer r, Integer c, Integer min, Integer max) {
        Integer[][] matrix = new Integer[r][c];

        for (int i = 0; i < r * c; i++) {
            matrix[i / c][i % c] = Utils.getRandomNumber(min, max);
        }
        return new Matrix(matrix);
    }

    public HashMap<String, MatrixEle> allValidInProximity(MatrixEle matrixEle) {
        HashMap<String, MatrixEle> hashMap = new HashMap<String, MatrixEle>();
        hashMap.put("up", up(matrixEle));
        hashMap.put("down", down(matrixEle));
        hashMap.put("left", left(matrixEle));
        hashMap.put("right", right(matrixEle));
        return hashMap;
    }

    public MatrixEle up(MatrixEle matrixEle) {
        MatrixEle newMatrixEle = new MatrixEle(matrixEle);
        newMatrixEle.reduceY();
        return directionBase(newMatrixEle, matrixEle);
    }

    public MatrixEle down(MatrixEle matrixEle) {
        MatrixEle newMatrixEle = new MatrixEle(matrixEle);
        newMatrixEle.addY();
        return directionBase(newMatrixEle, matrixEle);
    }

    public MatrixEle left(MatrixEle matrixEle) {
        MatrixEle newMatrixEle = new MatrixEle(matrixEle);
        newMatrixEle.reduceX();
        return directionBase(newMatrixEle, matrixEle);
    }

    public MatrixEle right(MatrixEle matrixEle) {
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
        return !(matrixEle.getX() >= r | matrixEle.getY() >= c | matrixEle.getX() < 0 | matrixEle.getY() < 0);
    }

    public MatrixEle indexToTwo(Integer i) {
        return new MatrixEle(i / c, i % c);
    }

    public Integer TwoToOneIndex(Integer i, Integer j) {
        return TwoToOneIndex(i, j, r);
    }

    static public Integer TwoToOneIndex(Integer i, Integer j, Integer r) {
        return r * i + j;
    }

    public String toString() {

        String str = "";
        for (int i = 0; i < r * c; i++) {
            str = str + this.matrix[i / c][i % c] + " ";
            if ((i % c) == c - 1) {
                str = str + "\n";
            }
        }
        return str.substring(0, str.length() - 1);
    }

    public Integer valueAtElement(MatrixEle matrixEle) {
        if (isIndexValid(matrixEle)) {
            return matrix[matrixEle.getX()][matrixEle.getY()];
        }
        return null;
    }

    public Iterator<MatrixEle> iterator() {
        Iterator<MatrixEle> it = new Iterator<MatrixEle>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < c * r;
            }

            @Override
            public MatrixEle next() {
                return indexToTwo(currentIndex++);

            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
