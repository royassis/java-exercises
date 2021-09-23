package MatrixPackage;

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

    public Integer[][] allValidInProximity(Integer i, Integer j) {
        return new Integer[][] { up(i), down(i), left(i), right(i) };
    }

    public Integer[] up(Integer i) {
        Integer[] two = indexToTwo(i);
        Integer[] arr = new Integer[] { two[0] - 1, two[1] };
        return directionBase(arr, i);
    }

    public Integer[] down(Integer i) {
        Integer[] two = indexToTwo(i);
        Integer[] arr = new Integer[] { two[0] + 1, two[1] };
        return directionBase(arr, i);
    }

    public Integer[] left(Integer i) {
        Integer[] two = indexToTwo(i);
        Integer[] arr = new Integer[] { two[0], two[1] - 1 };
        return directionBase(arr, i);
    }

    public Integer[] right(Integer i) {
        Integer[] two = indexToTwo(i);
        Integer[] arr = new Integer[] { two[0], two[1] + 1 };
        return directionBase(arr, i);
    }

    public Integer[] directionBase(Integer[] arr, Integer i) {
        if (isIndexValid(arr[0], arr[1]) && isIndexValid(i)) {
            return arr;
        }
        return null;
    }

    public Boolean isIndexValid(Integer i) {
        Integer[] two = indexToTwo(i);
        return isIndexValid(two[0], two[1]);
    }

    public Boolean isIndexValid(Integer i, Integer j) {
        return !(i >= r | j >= c | i < 0 | j < 0);
    }

    public Integer[] indexToTwo(Integer i) {
        return new Integer[] { i / c, i % c };
    }

    public Integer TwoToOneIndex(Integer i, Integer j) {
        return TwoToOneIndex(i, j, r);
    }

    static public Integer TwoToOneIndex(Integer i, Integer j, Integer r) {
        return r * i + j;
    }

    void printMatrix() {

        for (int i = 0; i < r * c; i++) {
            System.out.print(this.matrix[i / c][i % c] + " ");
            if ((i % c) == c - 1) {
                System.out.println();
            }
        }
    }
}
