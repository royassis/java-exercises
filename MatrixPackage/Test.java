package MatrixPackage;

class Test{
    public static void main (String[] args){
        Matrix matrix = Matrix.generateRandomMatrix(3,4,0,6);
        matrix.printMatrix();
    }
}