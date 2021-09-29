package ads.BinaryTree;


public class BinaryTree {
    Node root = null;

    public BinaryTree(Integer val) {
        root = new Node(val);
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

    public void printPreorderTraversal() {
        printPreorderTraversalBase(this.root);
        System.out.println();
    }

    public void printPreorderTraversalBase(Node currentNode) {
        if (currentNode == null) {
            return;
        }

        if (currentNode.left != null) {
            printPreorderTraversalBase(currentNode.left);
        }
        if (currentNode.right != null) {
            printPreorderTraversalBase(currentNode.right);
        }
        System.out.print(currentNode.val + " ");
    }

}