package ads.binarytree;

public class Node {
    Node left;
    Node right;
    final int val;

    public Node getLeft() {
        return left;
    }

    @Override
    public String toString() {
        String outLeft = left != null? "*" : "";
        String outRight = right != null? "*" : "";;
        return "Node [left=" + outLeft + ", right=" + outRight + ", val=" + val + "]";
    }

    public void setRight(int val) {
        setRight(new Node(val));
    }

    public void setLeft(int val) {
        setLeft(new Node(val));
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public boolean valueEquals(Node other) {
        return val == other.getVal();
    }

    public boolean directionsEquals(Node other) {
        return other.isLeft() == isLeft() && other.isRight() == isRight() ;
    }

    public int getVal() {
        return val;
    }

    public Node(int newVal) {
        val = newVal;
    }

    public Boolean all () {
        return isRight() && isLeft();
    }

    public Boolean any () {
        return isRight() || isLeft();
    }
    public Boolean isRight () {
        return right != null ;
    }
    public Boolean isLeft () {
        return left != null ;
    }
}
