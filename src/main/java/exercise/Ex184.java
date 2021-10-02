package exercise;

import ads.binarytree.*;

public class Ex184 {

    public static void main(String[] args) {

    
        BinaryTree tree = new BinaryTree(new Integer[]{4,2,5,6,7,1, 9});
        tree.printPreOrderTraversal();

        System.out.println(maxDepth(tree));

    }
    static int maxDepth(BinaryTree tree){
        return maxDepthBase(tree.getRoot(), 1);
    }

    static int maxDepthBase(Node node, int depth){
        if (!node.any()){
            return depth;
        }
        int a = 0;
        int b = 0;

        if (node.isLeft()) {
            a = maxDepthBase(node.getLeft(), depth+1);
        }

        if (node.isRight()) {
            b = maxDepthBase(node.getRight(), depth+1);
        }

        return a > b ? a : b;
    }
}
