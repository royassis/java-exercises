package ads.binarytree;


public class BinaryTree {
    Node root = null;

    public BinaryTree(Integer val) {
        root = new Node(val);
    }

    public Node getRoot(){
        return this.root;
    }

    public BinaryTree() {

    }

    public void add(Node newNode) {
        if (this.root == null){
            this.root = newNode;
        }else{
            
            this.addBase(this.root, newNode);
        }

    }

    public void add(Integer val) {
        add( new Node(val));
    }

    public void add(Integer...arr) {
        for (Integer n : arr){
            add( new Node(n));
        }
    }


    // public void addBase(Node currentNode, Node newNode) {
    //     if (currentNode.left == null) {
    //         currentNode.left = newNode;
    //         return;
    //     } else if (currentNode.right == null) {
    //         currentNode.right = newNode;
    //         return;
    //     }
    //     currentNode = currentNode.val < newNode.val ? currentNode.right : currentNode.left;
    //     this.addBase(currentNode, newNode);
    // }

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

}