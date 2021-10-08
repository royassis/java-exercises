package myexercises;

import ads.binarytree.*;

public class PrintTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(new Integer[]{14,7,3,10,2,12, 30, 18,17, 29,32,31, 35});

        tree.printTreeRepresentation(" ", 2, 2);
    }

}


