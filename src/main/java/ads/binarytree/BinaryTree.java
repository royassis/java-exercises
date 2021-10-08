package ads.binarytree;

import static utils.Utils.getNumberLength;
import java.util.*;

public class BinaryTree {
    Node root = null;

    public BinaryTree(Integer... val) {
        add(val);
    }

    public BinaryTree(Integer val) {
        root = new Node(val);
    }

    public Node getRoot() {
        return this.root;
    }

    public BinaryTree() {

    }

    public void add(Integer val) {
        add(new Node(val));
    }

    public void add(Integer... arr) {
        for (Integer n : arr) {
            add(new Node(n));
        }
    }

    public void add(Node newNode) {
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.addBase(this.root, newNode);
        }

    }

    public void addBase(Node currentNode, Node newNode) {
        if (newNode.val > currentNode.val) {
            if (currentNode.right == null) {
                currentNode.right = newNode;
                return;
            } else {
                this.addBase(currentNode.right, newNode);
            }
        } else {
            if (currentNode.left == null) {
                currentNode.left = newNode;
                return;
            } else {
                this.addBase(currentNode.left, newNode);
            }
        }

    }

    public void printPreOrderTraversal() {
        printPreOrderTraversalBase(this.root);
        System.out.println();
    }

    public void printPostOrderTraversal() {
        printPostOrderTraversalBase(this.root);
        System.out.println();
    }

    public Integer getMaxDigitsInTreeLevels() {
        int h = maxDepth();
        int max = 0;
        for (int i = 1; i < h + 1; i++) {
            int result = getSumExtraDigitsInTreeLevels(getRoot(), i, 0);
            if (result > max) {
                max = result;
            }
        }
        return max;
    }

    public Integer getSumExtraDigitsInTreeLevels(Node currentNode, Integer level, Integer sum) {
        if (currentNode == null) {
            return 0;
        }

        // print number
        if (level == 1) {
            int nDigits = getNumberLength(currentNode.getVal());
            return nDigits > 1 ? nDigits - 1 : 0;
        }

        int a = 0;
        int b = 0;
        if (level > 1) {
            a = sum + getSumExtraDigitsInTreeLevels(currentNode == null ? null : currentNode.left, level - 1, 0);
            b = sum + getSumExtraDigitsInTreeLevels(currentNode == null ? null : currentNode.right, level - 1, 0);
        }

        return a + b;
    }

    public void printLevelOrder(String sep) {

        int h = maxDepth();

        // extraDigitsFactors
        int edf = getMaxDigitsInTreeLevels();

        int end = (int) (((Math.pow(3, ((float) h - 1.0))) + edf - 1) / 2);

        for (int i = 1; i < h + 1; i++) {
            printCurrentLevel(getRoot(), i, end, sep);
            System.out.println();
        }
    }

    public void printCurrentLevel(Node currentNode, int level, int maxDepth, String sep) {

        int nTimes = maxDepth;
        String valOrSpace = currentNode == null ? sep : Integer.toString(currentNode.getVal());

        // print number
        if (level == 1) {
            System.out.print(sep.repeat(nTimes));
            System.out.print(valOrSpace);
            System.out.print(sep.repeat(nTimes));
            return;
        }

        if (level > 1) {
            int newDepth = (maxDepth - 1) / 3;
            printCurrentLevel(currentNode == null ? null : currentNode.left, level - 1, newDepth, sep);
            printCurrentLevel(null, level - 1, newDepth, sep);
            printCurrentLevel(currentNode == null ? null : currentNode.right, level - 1, newDepth, sep);
        }

    }

    public void printPreOrderTraversalBase(Node currentNode) {
        if (currentNode == null) {
            return;
        }
        System.out.print(currentNode.val + " ");

        if (currentNode.left != null) {
            printPreOrderTraversalBase(currentNode.left);
        }
        if (currentNode.right != null) {
            printPreOrderTraversalBase(currentNode.right);
        }

    }

    public void printPostOrderTraversalBase(Node currentNode) {
        if (currentNode == null) {
            return;
        }

        if (currentNode.left != null) {
            printPreOrderTraversalBase(currentNode.left);
        }
        if (currentNode.right != null) {
            printPreOrderTraversalBase(currentNode.right);
        }

        System.out.print(currentNode.val + " ");

    }

    public void copyTree(BinaryTree other) {
        copyTree(this, other);
    }

    public static void copyTree(BinaryTree oldTree, BinaryTree newTree) {
        newTree.add(oldTree.getRoot().getVal());
        copyTreeBase(oldTree.getRoot(), newTree.getRoot());
    }

    static void copyTreeBase(Node oldTreeNode, Node newTreeNode) {

        if (oldTreeNode.isLeft()) {
            newTreeNode.setLeft(oldTreeNode.getLeft().getVal());
            copyTreeBase(oldTreeNode.getLeft(), newTreeNode.getLeft());
        }

        if (oldTreeNode.isRight()) {
            newTreeNode.setRight(oldTreeNode.getRight().getVal());
            copyTreeBase(oldTreeNode.getRight(), newTreeNode.getRight());
        }

    }

    public Boolean compareTrees(BinaryTree other) {
        return compareTreesBase(this.getRoot(), other.getRoot());
    }

    public static Boolean compareTrees(BinaryTree oldTree, BinaryTree newTree) {
        return compareTreesBase(oldTree.getRoot(), newTree.getRoot());
    }

    public static Boolean compareTreesBase(Node nodeA, Node nodeB) {

        Boolean a = true;
        Boolean b = true;
        if (nodeA.isLeft()) {
            if (nodeB.isLeft()) {
                a = compareTreesBase(nodeA.getLeft(), nodeB.getLeft());
            } else {
                return false;
            }
        }
        if (nodeA.isRight()) {
            if (nodeB.isRight()) {
                b = compareTreesBase(nodeA.getRight(), nodeB.getRight());
            } else {
                return false;
            }
        }

        return a && b && nodeA.valueEquals(nodeB);
    }

    public int maxDepth() {
        return maxDepth(this);
    }

    public static int maxDepth(BinaryTree tree) {
        return maxDepthBase(tree.getRoot(), 1);
    }

    static int maxDepthBase(Node node, int depth) {
        if (!node.any()) {
            return depth;
        }
        int a = 0;
        int b = 0;

        if (node.isLeft()) {
            a = maxDepthBase(node.getLeft(), depth + 1);
        }

        if (node.isRight()) {
            b = maxDepthBase(node.getRight(), depth + 1);
        }

        return a > b ? a : b;
    }

    public void rotateClockwise() {
        root = rotateClockwiseBase(this.getRoot(), null, -1);
    }

    public Node rotateClockwiseBase(Node currentNode, Node parentNode, int direction) {

        if (currentNode == null || !currentNode.any()) {
            return null;
        } 

        if (currentNode.isRight()){
            rotateClockwiseBase(currentNode.getRight(), currentNode, 0);
            currentNode = switchNodes(currentNode, currentNode.getRight(), 0);
        }

        if (currentNode.isLeft()){
            rotateClockwiseBase(currentNode.getLeft(), currentNode, 1);
            currentNode = switchNodes(currentNode, currentNode.getLeft(), 1);
        }

        if (direction == 0) {
            parentNode.right = currentNode;
        }
        else if (direction == 1) {
            parentNode.left = currentNode;
        }

        return currentNode;
    }

    public static Node switchNodes(Node parent, Node child, int direction) {
        Node childLeft = child.getLeft();
        Node childRight = child.getRight();

        if (direction == 0) {
            child.setRight(parent);
            child.setLeft(parent.getLeft());
        }
        if (direction == 1) {
            child.setLeft(parent);
            child.setRight(parent.getRight());
        }
        parent.setLeft(childLeft);
        parent.setRight(childRight);

        return child;
    }

    public static void printTreeRepresentation(ArrayList<ArrayList<NodeLocation>> arr, String sep, Integer nRepeats,
            Integer lineSpaces) {

        sep = sep.repeat(nRepeats);
        for (int level = 0; level < arr.size(); level++) {
            int lastIdx = 0;
            for (NodeLocation nl : arr.get(level)) {
                int delta = nl.getXIdx() - lastIdx;
                lastIdx = nl.getXIdx() + 1;
                System.out.print(sep.repeat(delta) + nl.getVal());
            }
            System.out.print("\n".repeat(lineSpaces));
        }
    }

    public static Integer getNodeLocations(ArrayList<ArrayList<NodeLocation>> arr, Node currentNode, int level,
            int cumAdd, Integer leftOrRIght) {

        if (currentNode == null) {
            return cumAdd;
        }

        Integer a = getNodeLocations(arr, currentNode.getLeft(), level + 1, cumAdd, 0);

        arr.get(level).add(new NodeLocation(currentNode.getVal(), leftOrRIght, a, level));

        System.out.println("x:" + a + " cumAdd:" + cumAdd + " level:" + level + " val:" + currentNode.getVal());

        return getNodeLocations(arr, currentNode.getRight(), level + 1, a + 1, 1);
    }

}