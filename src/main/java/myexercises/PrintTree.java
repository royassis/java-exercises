package myexercises;

import ads.binarytree.*;
import java.util.ArrayList;

class NodeLocation{
    Integer val=null;
    Integer leftOrRightChild = null;
    Integer xLoc = null;
    Integer level = null;
    
    public NodeLocation(Integer val, Integer leftOrRightChild, Integer xLoc, Integer level) {
        this.val = val;
        this.leftOrRightChild = leftOrRightChild;
        this.xLoc = xLoc;
        this.level = level;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public Integer getLeftOrRightChild() {
        return leftOrRightChild;
    }

    public void setLeftOrRightChild(Integer leftOrRightChild) {
        this.leftOrRightChild = leftOrRightChild;
    }

    public Integer getXIdx() {
        return xLoc;
    }

    public void setxLoc(Integer xLoc) {
        this.xLoc = xLoc;
    }

    @Override
    public String toString() {
        // return "[y=" + level + ", v=" + val + ", x="+ xLoc + "]";
        return Integer.toString(val);
    }

    public Integer getLevel() {
        return level;
    }


    public void setLevel(Integer level) {
        this.level = level;
    }
    
}

public class PrintTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(new Integer[]{14,7,3,10,2,12, 30, 18,17, 29,32,31, 35});
        // BinaryTree tree = new BinaryTree(new Integer[]{14,7,10,30, 18});
        // BinaryTree tree = new BinaryTree(new Integer[]{5,3,7,4,6});
        // BinaryTree tree = new BinaryTree(new Integer[]{5,3,7, 9});
    
        int h = tree.maxDepth();

        ArrayList<ArrayList<NodeLocation>> arr = new ArrayList<ArrayList<NodeLocation>>();
        
        for (int i = 0; i < h; i++) {
            arr.add(new ArrayList<NodeLocation>());
        }
        
        getNodeLocations(arr, tree.getRoot(), 0, 0, 0);
        System.out.println();

        String sep = " ";
        Integer nRepeats = 2;
        Integer lineSpaces = 2;
        printTreeRepresentation(arr, sep, nRepeats, lineSpaces);
    }

    public static void printTreeRepresentation(ArrayList<ArrayList<NodeLocation>> arr, String sep, Integer nRepeats, Integer lineSpaces){

        sep = sep.repeat(nRepeats);
        for (int level = 0; level< arr.size() ;level ++) {
            int lastIdx = 0;
            for (NodeLocation nl : arr.get(level)) {
                int delta = nl.getXIdx() - lastIdx;
                lastIdx = nl.getXIdx() + 1;
                System.out.print(sep.repeat(delta)+nl.getVal());
            }
            System.out.print("\n".repeat(lineSpaces));
        }
    }

    public static Integer getNodeLocations(ArrayList<ArrayList<NodeLocation>> arr, Node currentNode, int level, int cumAdd, Integer leftOrRIght) {

            if (currentNode == null){
                return cumAdd;
            }

            Integer a = getNodeLocations(arr, currentNode.getLeft(), level+1,  cumAdd , 0);

            arr.get(level).add(new NodeLocation(currentNode.getVal(), leftOrRIght, a, level));

            System.out.println("x:"+a+" cumAdd:"+cumAdd+" level:"+level +" val:" + currentNode.getVal());

            return getNodeLocations(arr, currentNode.getRight(), level+1, a + 1, 1);
    }
}

