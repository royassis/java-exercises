package exercise;

import ads.binarytree.*;

public class Ex182 {

    public static void main(String[] args) {
        Integer[] arr = utils.Utils.getRandomArr(4, 1, 9);

        BinaryTree tree = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        for (int x : arr) {
            tree.add(x);
        }

        tree.copyTree(tree2);
        System.out.println(tree.compareTrees(tree2));

    }
}
