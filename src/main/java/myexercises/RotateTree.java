package myexercises;

import ads.binarytree.*;


public class RotateTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(new Integer[]{5,3,7, 9});

        tree.printPreOrderTraversal();

        tree.rotateClockwise(tree);

        tree.printPreOrderTraversal();
    }

}


