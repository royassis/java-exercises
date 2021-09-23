import java.util.concurrent.TimeUnit;
import java.util.HashSet;

// Write a Java program to get the preorder traversal of its nodes' values of a given a binary tree
public class Ex133 {

    public static Integer[][] getMatrix(Integer c, Integer r, Integer min, Integer max) {
        Integer[][] matrix = new Integer[c][r];

        for (int i = 0; i < r * c; i++) {
            matrix[i % r][i / c] = getRandomNumber(min, max);
        }
        return matrix;
    }

    public static Integer getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
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

    static Integer sumOfIntegersAlongLongestPath(Integer[][] matrix) throws InterruptedException{
        int c = matrix.length;
        Integer i =0;
        int sum =0;
        HashSet<Integer> prevLocations = new HashSet<Integer> ();
        while (i != c*c-1){
            sum = sum + matrix[i%c][i/c];
            prevLocations.add((Integer)i);
            i = getNextLargestElementIndex(matrix, i,  prevLocations);      
            System.out.println(String.format("(%d,%d)", i/c+1, i%c+1));
            TimeUnit.SECONDS.sleep(1);
        }
        return sum;
    }
    static Integer getNextLargestElementIndex(Integer[][] matrix, Integer currentIndex, HashSet<Integer> prevLocations){
        int matrixDim = matrix.length;
        
        Integer[] possibleIndices = {(currentIndex-matrixDim), (currentIndex+matrixDim), (currentIndex-1), (currentIndex+1)};
        Integer maxPos = 1;
        Integer maxVal = possibleIndices[maxPos];

        for (int j =0; j< possibleIndices.length; j++){
            Integer nextIndex = possibleIndices[j];
            Integer c= nextIndex%matrixDim;
            Integer r= nextIndex/matrixDim;

            if (isIndexValid(matrix, nextIndex, prevLocations) && matrix[c][r] >= maxVal){
                maxPos = nextIndex;
                maxVal = matrix[c][r];
            }
        }

        return maxPos;
    }
    static Boolean isIndexValid(Integer[][] matrix, Integer currentIndex, HashSet<Integer> prevLocations){
        return !(isIndexInBound(matrix, currentIndex) || prevLocations.contains(currentIndex));
    }

    static Boolean isIndexInBound(Integer[][] matrix, Integer currentIndex){
        Integer matrixDim = matrix.length;
        return (currentIndex%matrixDim >= matrixDim | currentIndex/matrixDim >= matrixDim | currentIndex%matrixDim < 0 | currentIndex/matrixDim < 0) ;
    }

    public static void main(String[] args) throws InterruptedException{
        Integer[][] matrix = getMatrix(3, 3, 0, 20);
        printMatrix(matrix);

        System.out.println(sumOfIntegersAlongLongestPath(matrix)) ;
    }

}