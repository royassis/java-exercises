package ads.binarytree;


public class BinaryTree {
    Node root = null;

    public BinaryTree(Integer... val) {
        add(val);
    }

    public BinaryTree(Integer val) {
        root = new Node(val);
    }

    public Node getRoot(){
        return this.root;
    }

    public BinaryTree() {

    }

    public void add(Integer val) {
        add( new Node(val));
    }

    public void add(Integer...arr) {
        for (Integer n : arr){
            add( new Node(n));
        }
    }

    public void add(Node newNode) {
        if (this.root == null){
            this.root = newNode;
        }else{
            this.addBase(this.root, newNode);
        }

    }

    public void addBase(Node currentNode, Node newNode) {
        if (newNode.val >  currentNode.val){
            if (currentNode.right == null){
                currentNode.right = newNode;
                return;
            }else{
                this.addBase(currentNode.right, newNode);
            }
        }else{
            if (currentNode.left == null){
                currentNode.left = newNode;
                return;
            }else{
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

        if(oldTreeNode.isRight()) {
            newTreeNode.setRight(oldTreeNode.getRight().getVal());
            copyTreeBase(oldTreeNode.getRight(), newTreeNode.getRight());
        }
     
    }
    public Boolean compareTrees(BinaryTree other){
        return compareTreesBase(this.getRoot(), other.getRoot());
    }

    public static Boolean compareTrees(BinaryTree oldTree, BinaryTree newTree){
        return compareTreesBase(oldTree.getRoot(), newTree.getRoot());
    }

    public static Boolean compareTreesBase(Node nodeA, Node nodeB){
        
        Boolean a = true;
        Boolean b = true;
        if (nodeA.isLeft()){
            if(nodeB.isLeft()){
                a = compareTreesBase(nodeA.getLeft(), nodeB.getLeft());
            }else{
                return false;
            }
        }
        if (nodeA.isRight()){
            if(nodeB.isRight()){
                b = compareTreesBase(nodeA.getRight(), nodeB.getRight());
            }else{
                return false;
            }
        }

        return a && b && nodeA.valueEquals(nodeB);
    }

}