package myexercises;

import ads.binarytree.*;
import java.util.ArrayList;


public class PrintTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(new Integer[]{14,7,3,10,2,12, 30, 18,17, 29,32,31, 35});
        // BinaryTree tree = new BinaryTree(new Integer[]{14,7,10,30, 18});
        // BinaryTree tree = new BinaryTree(new Integer[]{5,3,7,4,6});
        // BinaryTree tree = new BinaryTree(new Integer[]{5,3,7, 9});
    
        int h = tree.maxDepth();

        ArrayList<ArrayList<NodeLocation>> arr = new ArrayList<ArrayList<NodeLocation>>();
        
        for (int i = 0; i < h; i++) {
            arr.add(new ArrayList<NodeLocation>());
        }
        
        BinaryTree.getNodeLocations(arr, tree.getRoot(), 0, 0, 0);
        System.out.println();

        String sep = " ";
        Integer nRepeats = 2;
        Integer lineSpaces = 2;
        BinaryTree.printTreeRepresentation(arr, sep, nRepeats, lineSpaces);
    }

}


