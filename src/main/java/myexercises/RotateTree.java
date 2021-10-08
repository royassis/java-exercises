package myexercises;

import ads.binarytree.*;


public class RotateTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(new Integer[]{5,3,7, 9});

        tree.printTreeRepresentation(" ", 1, 1);

        tree.rotateClockwise();

        tree.printTreeRepresentation(" ", 1, 1);
    }

}


