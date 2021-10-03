package myexercises;

import ads.binarytree.*;

public class PrintTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(new Integer[]{3,1,4,5});

        int maxDepth = tree.maxDepth();
        int start =0 ;
        int end = (int)(2*Math.pow(2, (double)maxDepth-1)-2);
        int currentDepth = 1;
        Node currentNode = tree.getRoot();

        printTree(currentNode, currentDepth, maxDepth,  start, end);
        System.out.println();
 
    }

    public static void printTree(Node currentNode, int currentDepth , int maxDepth, int start, int end){
        int middle = (start+end)/2;
        String c = "-";

        if (currentDepth > maxDepth || start > end) {
            return;
        }

        //check if number
        String numberOrSpace = currentNode != null ? Integer.toString(currentNode.getVal()) : c;

        //before number
        int nRepeats = (end-start)/2  ;

        System.out.print(c.repeat(nRepeats));

        //number
        System.out.print(numberOrSpace);

        //after number
        System.out.print(c.repeat(nRepeats));

        // if (currentNode!=null && (currentNode.isLeft() || currentNode.isRight())){
        //     System.out.println();
        // }

        if (end == 6){
            System.out.println();
        }

        printTree(currentNode != null ? currentNode.getLeft() : null, currentDepth+1, maxDepth, start, middle-1);
        printTree(null, currentDepth+1, maxDepth, middle, middle);
        printTree(currentNode != null ? currentNode.getRight() : null, currentDepth+1, maxDepth, middle+1, end);
        
    }



}
