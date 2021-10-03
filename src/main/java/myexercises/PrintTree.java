package myexercises;

import ads.binarytree.*;

public class PrintTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(new Integer[]{3,1,2,4,5});

        int maxDepth = tree.maxDepth();
        int end = (int)(2*Math.pow(2, (double)maxDepth-1)-2);
  
        tree.printLevelOrder();


    }
}
