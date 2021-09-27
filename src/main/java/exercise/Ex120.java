package exercise;

public class Ex120 {
    public static void main(String[] args) {
        int ele = Integer.parseInt(args[0]);

        int r = 3;
        int c = 3;

        Integer[][] matrix = new Integer[r][c];

        for (int i = 0; i < r * c; i++) {
            matrix[i % r][i / c] = i + 1;
        }

        printMatrix(matrix);

        Integer[] result = getEleIndexInMatrixBinarySearch(matrix, ele);
        if (result != null){
            System.out.println( String.format("Element %d was found at position %d,%d", ele,result[0]+1, result[1]+1));
        }else {
            System.out.println(String.format("Element %d was not found in matrix",ele));
        }
        

    }

    static void printMatrix(Integer[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r * c; i++) {
            System.out.print(matrix[i % r][i / c] + " ");
            if (i % r == c - 1) {
                System.out.println();
            }
        }

    }

    static Integer[] getEleIndexInMatrixBinarySearch(Integer[][] matrix, Integer ele) {
        int start = 0;
        int r = matrix.length;
        int c = matrix[0].length;

        int end = c * r;
        int mid = (start + end) / 2;

        if (ele > matrix[c - 1][r - 1]) {
            return null;
        }

        while (start <= end) {
            mid = (start + end) / 2;
            int matrixEle = matrix[mid % r][mid / c];

            if (ele == matrixEle) {
                return new Integer[] { mid % r, mid / c };
            } else if (matrixEle < ele) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return null;
    }
}