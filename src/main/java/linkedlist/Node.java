package linkedlist;

public class Node {
    @Override
    public String toString() {
        return "Node [val=" + val + "]";
    }
    Integer val;
    Node next = null;
    public  Node(Integer val) {
        this.val =val;
    }
    public Integer getVal() {
        return val;
    }
    public void setN(Integer val) {
        this.val = val;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Boolean hasNext() {
        if (this.next != null){
            return true;
        }else{
            return false;
        }
    }
}
