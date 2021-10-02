package myexercises;

import ads.binarytree.*;

public class PrintTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(new Integer[]{3,1,4,5});

        int maxDepth = tree.maxDepth();
        int start =0 ;
        int end = (int)(2*Math.pow(2, (double)maxDepth)-1);
        int currentDepth = 1;
        Node currentNode = tree.getRoot();

        printTree(currentNode, currentDepth, maxDepth,  start, end);
        System.out.println();
 
    }

    public static void printTree(Node currentNode, int currentDepth , int maxDepth, int start, int end){
        String str = "";
        int middle = (start+end)/2;

        if (currentDepth == maxDepth) {
            return;
        }

        //check if number
        String numberOrSpace = currentNode != null ? Integer.toString(currentNode.getVal()) : " ";

        //before number
        System.out.print(" ".repeat(maxDepth-currentDepth));

        //number
        System.out.print(numberOrSpace);

        //after number
        System.out.print(" ".repeat(maxDepth-currentDepth));

        if (currentNode.isLeft() || currentNode.isRight()){
            System.out.println();
        }

        printTree(currentNode.getLeft(), currentDepth+1, maxDepth, start, middle);
        printTree(currentNode.getRight(), currentDepth+1, maxDepth, middle+1, end);
        
    }



}
