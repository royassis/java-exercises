import MatrixPackage.*;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Ex133Rec {
    public static void main(String[] args) {
        Matrix matrix = Matrix.generateRandomMatrix(3, 3, 1, 6);
        System.out.println(matrix + "\n");
        System.out.println(foo(matrix));

    }
    static Integer foo(Matrix matrix){
        return fooBase(matrix, new MatrixEle());
    }
    static Integer fooBase(Matrix matrix, MatrixEle currentLocation){
        Integer resultsA=null;
        Integer resultsB =null;
        System.out.println(currentLocation);
        if (matrix.down(currentLocation) == null && matrix.right(currentLocation) == null ){
            return matrix.valueAtElement(currentLocation);

        }if(matrix.down(currentLocation) != null ){
            resultsA = matrix.valueAtElement(currentLocation) + fooBase(matrix,new MatrixEle(currentLocation).addY());

        }if(matrix.right(currentLocation) != null){
            resultsB = matrix.valueAtElement(currentLocation)+ fooBase(matrix, new MatrixEle(currentLocation).addX());
        }

        Stream<Integer> s= Stream.of(resultsA,resultsB);
        Optional<Integer> o = s.collect(Collectors.maxBy(new IntegerComparator()));
        // if (resultsA == null){
        //     return resultsB;
        // }
        // else if (resultsB == null){
        //     return resultsA;
        // }
        return (o.get());
    }

    static class IntegerComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer arg0, Integer arg1) {
            if (arg0 == null && arg1 == null){
                return -2;
            }
            if (arg1 == null){
                return 1;
            }
            if (arg0 == null){
                return 1;
            }
            if (arg0 > arg1){
                return 1;
            }
            else if (arg0 < arg1){
                return -1;
            }
            return 0;
        }
    }
}

