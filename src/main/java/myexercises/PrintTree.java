package myexercises;

import ads.binarytree.*;

public class PrintTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(new Integer[]{7, 3, 10, 1, 2});
        
        tree.printLevelOrder(".");


    }
}
