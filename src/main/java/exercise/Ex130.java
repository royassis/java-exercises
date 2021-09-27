package exercise;
// Write a Java program to get the preorder traversal of its nodes' values of a given a binary tree
public class Ex130 {
    public static void main(String[] args) {
        class Node{
            Node left ;
            Node right ;
            int val ;
            public Node(int newVal){
                val = newVal;
            }
        }

        class BinaryTree{
            Node root =null;
            public BinaryTree(Integer val){
                root = new Node(val);
            }
            public void add(Node newNode){
                this.addBase(this.root, newNode);
            }
            public void addBase(Node currentNode, Node newNode){
                if (currentNode.left == null){
                    currentNode.left  = newNode;
                    return;
                }else if(currentNode.right == null){
                    currentNode.right  = newNode;
                    return;
                }
                currentNode = currentNode.val < newNode.val ? currentNode.right : currentNode.left;
                this.addBase(currentNode, newNode);
            }
            // public void printPreorderTraversal(){
            //     printPreorderTraversalBase(this.root);
            //     System.out.println();
            // }
            public Integer getMaxDepth(){
                return getMaxDepthBase(this.root, 1, 0);
            }
            public Integer getMaxDepthBase(Node currentNode, Integer depth, Integer maxDepth){
                if (currentNode == null){
                    return maxDepth;
                }
                if (currentNode.left != null){
                    maxDepth = getMaxDepthBase(currentNode.left, depth+1, maxDepth);
                }
                if (currentNode.right != null){
                    maxDepth = getMaxDepthBase(currentNode.right, depth+1, maxDepth);
                }
                if (depth> maxDepth){
                    maxDepth = depth;
                }
                return maxDepth;
            }
            // public void printPreorderTraversalBase(Node currentNode){
            //     if (currentNode == null){
            //         return;
            //     }
                
            //     if (currentNode.left != null){
            //         printPreorderTraversalBase(currentNode.left);
            //     }
            //     if (currentNode.right != null){
            //         printPreorderTraversalBase(currentNode.right);
            //     }
            //     System.out.print(currentNode.val +" ");
               
            // }

        }

        Integer randInt = getRandomNumber(-1,20);
        BinaryTree btree = new BinaryTree(randInt);
        System.out.print(randInt +" " );

        for (int i=0; i< 5; i++){
            randInt = getRandomNumber(-1,20);
            System.out.print(randInt +" " );
            btree.add(new Node(randInt));   
        }
        System.out.println();

        System.out.println(btree.getMaxDepth());

    }
    public static Integer getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}