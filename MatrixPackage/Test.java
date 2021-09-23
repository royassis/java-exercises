package MatrixPackage;

class Test{
    public static void main (String[] args){
        Matrix matrix = Matrix.generateRandomMatrix(3,4,0,6);
        matrix.printMatrix();

        Integer n = 11;
        System.out.println( matrix.right(n) != null ? matrix.right(n)[0] + ","+ matrix.right(n)[1]: null);
        System.out.println( matrix.left(n) != null ? matrix.left(n)[0] + ","+ matrix.left(n)[1]: null);
        System.out.println( matrix.up(n) != null ? matrix.up(n)[0] + ","+ matrix.up(n)[1]: null);
        System.out.println( matrix.down(n) != null ? matrix.down(n)[0] + ","+ matrix.down(n)[1]: null);
    }
}