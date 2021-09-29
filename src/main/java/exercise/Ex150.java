package exercise;

import ads.binarytree.*;

// Write a Java program to test if a binary tree is a subtree of another binary tree.

public class Ex150 {

    public static void main(String[] args) {
        BinaryTree treeA = new BinaryTree();
        BinaryTree treeB = new BinaryTree();

        treeA.add(2, 1, 3);
        treeB.add(3);

        System.out.println(foo(treeA, treeB));
    }

    static Boolean foo(BinaryTree treeA, BinaryTree treeB) {
        return fooBase(treeA.getRoot(), treeB.getRoot());
    }

    static Boolean fooBase(Node nodeA, Node nodeB) {
        System.out.println("nodeA: "+ nodeA + " nodeB: " + nodeB);
        if (!nodeA.any()) {
            if (nodeA.valueEquals(nodeB) && !nodeA.any() && !nodeB.any()) {
                return true;
            } else {
                return false;
            }
        }

        Boolean a = true;
        Boolean b = true;
        
        if (nodeA.valueEquals(nodeB)) {
            if (nodeA.isLeft() && nodeB.isLeft()) {
                a = fooBase(nodeA.getLeft(), nodeB.getLeft());
            }
            if (nodeA.isRight()&& nodeB.isRight()) {
                b = fooBase(nodeA.getRight(), nodeB.getRight());
            }
            return a && b;

        } else {
            if (nodeA.isLeft()) {
                a = fooBase(nodeA.getLeft(), nodeB);
            }
            if (nodeA.isRight()) {
                b = fooBase(nodeA.getRight(), nodeB);
            }
            return a || b;
        }
    }

}
