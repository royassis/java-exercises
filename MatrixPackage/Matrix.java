package MatrixPackage;

public class Matrix {
    Integer[][] matrix;
    Integer c;
    Integer r;

    public Matrix(Integer[][] newMatrix){
        matrix = newMatrix;
        r = newMatrix.length;
        c = newMatrix[0].length;
    }

    public static Matrix generateRandomMatrix(Integer r, Integer c, Integer min, Integer max) {
        Integer[][] matrix = new Integer[r][c];

        for (int i = 0; i < r * c; i++) {
            matrix[i / c][i % r] = Utils.getRandomNumber(min, max);
        }
        return new Matrix(matrix);
    }

    void printMatrix() {

        for (int i = 0; i < r * c; i++) {
            System.out.print(this.matrix[i / c][i % r] + " ");
            if ((i % c) == c-1) {
                System.out.println();
            }
        }
    }
}
