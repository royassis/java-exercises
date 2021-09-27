package matrixpackge;

import java.util.concurrent.TimeUnit;
import java.util.HashSet;

// Write a Java program to get the preorder traversal of its nodes' values of a given a binary tree
 public class GetNextLargestElementIndex {

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

    static Integer sumOfIntegersAlongLongestPath(Integer[][] matrix) throws InterruptedException {
        int c = matrix.length;
        Integer i = 0;
        int sum = 0;
        HashSet<Integer> prevLocations = new HashSet<Integer>();
        while (i != c * c - 1) {
            sum = sum + matrix[i % c][i / c];
            prevLocations.add((Integer) i);
            i = getNextLargestElementIndex(matrix, i, prevLocations);
            System.out.println(String.format("(%d,%d)", i / c + 1, i % c + 1));
            TimeUnit.MILLISECONDS.sleep(500);
        }
        return sum;
    }

    static Integer getNextLargestElementIndex(Integer[][] matrix, Integer currentIndex, HashSet<Integer> prevLocations) {
        int matrixDim = matrix.length;

        Integer up = ((currentIndex - matrixDim)/matrixDim > 0) ?  (currentIndex - matrixDim) : null;
        Integer down = ((currentIndex + matrixDim)/matrixDim < matrixDim) ?  (currentIndex + matrixDim) : null;;
        Integer left = (currentIndex%matrixDim - 1 > 0) ?  currentIndex-1 : null;;
        Integer right = (currentIndex%matrixDim + 1 < matrixDim) ?  currentIndex+1 : null;;

        Integer[] possibleIndices = {up, down, left, right};

        Integer maxPos = null;
        Integer maxVal = null;
        for (Integer p : possibleIndices){
            if (p != null && !prevLocations.contains(p)){
                maxPos = p;
                maxVal = matrix[p/matrixDim][p%matrixDim];
            }
        }

        for (int j = 0; j < possibleIndices.length; j++) {
            if (possibleIndices[j] != null && !prevLocations.contains(currentIndex)){
                Integer nextIndex = possibleIndices[j];
                Integer c = nextIndex / matrixDim;
                Integer r = nextIndex % matrixDim;
                if ( matrix[c][r] >= maxVal) {
                    maxPos = nextIndex;
                    maxVal = matrix[c][r];
                }

            }
        }

        return maxPos;
    }


    public static void main(String[] args) throws InterruptedException {
        Integer[][] matrix = getMatrix(3, 3, 0, 20);
        printMatrix(matrix);

        System.out.println(sumOfIntegersAlongLongestPath(matrix));
    }

}