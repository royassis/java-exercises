package matrixpackge;

import java.util.HashMap;

class Test {
    public static void main(String[] args) {
        Matrix matrix = Matrix.generateRandomMatrix(10, 10, 0, 6);
        System.out.println(matrix + "\n");

        MatrixEle ele = matrix.indexToTwo(matrix.size-1);
        System.out.println("current index: " + ele);
        System.out.println("right: " + matrix.right(ele));
        System.out.println("left: " + matrix.left(ele));
        System.out.println("up: " + matrix.up(ele));
        System.out.println("down: " + matrix.down(ele));
        System.out.println();

        HashMap<String, MatrixEle> hashMap = matrix.allValidInProximity(ele);
        System.out.println(hashMap);
        System.out.println();

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

// "↓" "→"
