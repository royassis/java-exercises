package exercise;

import java.util.Arrays;

import ads.binarytree.*;

public class Ex177 {

    public static void main(String[] args) {

        Integer[] arr = utils.Utils.getRandomArr(4, 1, 9);
        System.out.println(Arrays.toString(arr));

        BinaryTree tree = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        for (int x : arr) {
            tree.add(x);
        }

        copyTree(tree, tree2);

        tree.printPreOrderTraversal();
        tree2.printPreOrderTraversal();

    }

    static void copyTree(BinaryTree oldTree, BinaryTree newTree) {
        newTree.add(oldTree.getRoot().getVal());
        copyTreeBase(oldTree.getRoot(), newTree.getRoot());
    }

    static void copyTreeBase(Node oldTreeNode, Node newTreeNode) {
        
        if (oldTreeNode.isLeft()) {
            newTreeNode.setLeft(oldTreeNode.getLeft().getVal());
            copyTreeBase(oldTreeNode.getLeft(), newTreeNode.getLeft());
        }

        if(oldTreeNode.isRight()) {
            newTreeNode.setRight(oldTreeNode.getRight().getVal());
            copyTreeBase(oldTreeNode.getRight(), newTreeNode.getRight());
        }
     
    }
}
