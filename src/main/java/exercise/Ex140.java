package exercise;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Write a Java program to get the index of the first number and the last number of a subarray where the sum of numbers is zero from a given array of integers
class Interval {

    Integer start;
    Integer end;
    public Interval(Integer start,Integer end) throws Exception{
        if (start > end){
            throw new Exception();
        }

        this.start = start;
        this.end = end;
    }
    @Override
    public String toString() {
        return "Interval [start=" + start + ", end=" + end + "]";
    }
    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }
    public Integer getEnd() {
        return end;
    }
    public void setEnd(Integer end) {
        this.end = end;
    }
    public Interval merge(Interval other) throws Exception{
        if (canIntersect(other)){
            return new Interval(Math.min((int)this.getStart(), (int)other.getStart()),
                                Math.max((int)this.getEnd(), (int)other.getEnd())
                                );
        }
        return null;
    }
    Boolean canIntersect(Interval other){
        if (this.getStart() <= other.getEnd() && this.getEnd() >= other.getStart()){
            return true;
        }
        return false;
    }


}

class Compare implements Comparator<Interval> {
    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(Interval a, Interval other){
        if (a.getStart() == other.getStart() && a.getEnd() == other.getEnd()){
            return 0;
        }else if (a.getEnd() <= other.getStart() && a.getStart() >= other.getEnd()){
            return 1;
        }else if (other.getEnd() >= other.getStart()){
            return 1;
        }else {
            return -1;
        }
    }
}

public class Ex140 {
    public static void main(String[] args) throws Exception {

        ArrayList<Interval> intervalLs = new ArrayList<Interval>();
        intervalLs.add(new Interval(1, 3));
        intervalLs.add(new Interval(2, 4));
        intervalLs.add(new Interval(1, 2));
        intervalLs.add(new Interval(5, 6));
        
        intervalLs = (ArrayList<Interval>)intervalLs.stream().sorted(new Compare()).collect(Collectors.toList());
        System.out.println(intervalLs);

        Integer arrSize = intervalLs.size() + 1;
        int i = 1;
        while (arrSize != intervalLs.size()){
            arrSize = intervalLs.size();
            while (i< intervalLs.size()) {
                if (intervalLs.get(0).canIntersect(intervalLs.get(i))){
                    intervalLs.set(0, intervalLs.get(0).merge(intervalLs.get(i)));
                    intervalLs.remove(intervalLs.get(i));
                }else{
                    i++;
                }
            }
        }
        System.out.println(intervalLs);
    }
}   

