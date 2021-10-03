package myexercises;

import ads.binarytree.*;

public class PrintTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(new Integer[]{14,7,3,10,2,12, 30, 18,17, 29,32,31, 35});

        BinaryTree tree2 = new BinaryTree(new Integer[]{4,2,5});
        
        // tree.printLevelOrder("-");

        // System.out.println();

        tree.printLevelOrder("-");

        System.out.println (tree.getMaxDigitsInTreeLevels());

    }
}
