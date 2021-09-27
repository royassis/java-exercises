package exercise;
import matrixpackge.*;

// Ex133 Write a Java program to find a path from top left to bottom in right direction which minimizes the sum of all numbers along its path.
class Ex133 {
    public static void main(String[] args) {
        Matrix matrix = Matrix.generateRandomMatrix(10, 10, 0, 6);
        System.out.println(matrix + "\n");

        MatrixEle matrixEle = new MatrixEle();

        while (matrixEle != null ){
            String p = String.format("%s - %d", matrixEle, matrix.valueAtElement(matrixEle));
            System.out.println(p);
            if (matrix.right(matrixEle) == null && matrix.down(matrixEle) == null){
                matrixEle = null;
                break;
            }
            else if (matrix.right(matrixEle) != null && matrix.down(matrixEle) != null){
                if (matrix.valueAtElement(matrix.right(matrixEle)) < matrix.valueAtElement(matrix.down(matrixEle))){
                    matrixEle.addX();
                }else{
                    matrixEle.addY();
                }
            }else if(matrix.down(matrixEle) != null){
                matrixEle.addY();
            }else{
                matrixEle.addX();
            }
        }
    }
}

