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

        // BinaryTree tree = new BinaryTree(new Integer[]{14,7,3,10,2,12, 30, 18,17, 29,32,31, 35});
        // BinaryTree tree = new BinaryTree(new Integer[]{14,7,10,30, 18});
        // BinaryTree tree = new BinaryTree(new Integer[]{5,3,7,4,6});
        BinaryTree tree = new BinaryTree(new Integer[]{5,3,7});
    
        int h = tree.maxDepth();

        ArrayList<ArrayList<NodeLocation>> arr = new ArrayList<ArrayList<NodeLocation>>();
        
        for (int i = 0; i < h; i++) {
            arr.add(new ArrayList<NodeLocation>());
        }
        
        cumSumTree(arr, tree.getRoot(), 0, 1, 0);
        System.exit(1);
        // level 
        for (int level = 0; level< arr.size() ;level ++) {

            ArrayList<NodeLocation> currentLevel = arr.get(level);
            Integer maxTileIdx = currentLevel.get(currentLevel.size()-1).getXIdx();
            int tileIdx = 0;
            int eleIdx = 0 ;
            String sep = " ";

            while ( tileIdx <= maxTileIdx && eleIdx < arr.get(level).size()) {
                NodeLocation ele = arr.get(level).get(eleIdx);
                if (ele.getXIdx() == tileIdx){
                    System.out.print(ele);
                    eleIdx++;
                }else{
                    System.out.print(sep);
                }
                tileIdx++;
            }
            System.out.println();
        }

    }

    public static Integer cumSumTree(ArrayList<ArrayList<NodeLocation>> arr, Node currentNode, int level, int cumAdd, Integer leftOrRIght) {

            if (currentNode == null){
                return 1;
            }

            // left branch node count
            Integer a = 1 + cumSumTree(arr, currentNode.getLeft(), level+1,  1, 0);

            arr.get(level).add(new NodeLocation(currentNode.getVal(), leftOrRIght, cumAdd, level));
            
            System.out.println("a:"+a+" cumAdd:"+cumAdd+" level:"+level);

            // left branch node count + // right branch node count
            Integer b = 1 +cumSumTree(arr, currentNode.getRight(), level+1, 1, 1);
            
        
            return a + b  + 1 ;
        
    }

}
