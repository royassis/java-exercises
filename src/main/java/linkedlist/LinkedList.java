package linkedlist;

public class LinkedList {

    Node head = null;
    Node tail= null;
    Integer size= 0;

    public LinkedList(Integer n) {
        head = new Node(n);
        tail = head;
        size = 1;
    }
    public LinkedList() {

    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void add(Node newNode) {
        if (this.getHead() != null){
            tail.next = newNode;
            tail = newNode;
        }
        else{
            head = newNode;
            tail = head;
            size = 1;
        }
        size++;
    }

    public void add(Integer n) {
        add(new Node(n));
    }

    public void removeByIndex(Integer i) {
        Node currentNode = this.getHead();
        Node prevNode = null;

        if (this.getSize() == 1 && i == 0) {
            this.head.setNext(null);
            return;
        }

        else if (i == 0) {
            this.setHead(this.getHead().getNext());
            return;
        }

        int j = 0;
        while (currentNode != null) {
            if (i == j) {
                prevNode.setNext(currentNode.getNext());
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.getNext();
            j++;
        }
    }

    public void removeByValue(Integer n) {
        Node currentNode = this.getHead().getNext();
        Node prevNode = this.getHead();

        while (currentNode != null) {
            if (currentNode.getVal() == n) {
                prevNode.setNext(currentNode.getNext());
                break;
            }
        }
    }

    static void printLinkedList(LinkedList ll) {
        Node currentNode = ll.getHead();

        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNext();
        }
    }

    void printLinkedList() {
        printLinkedList(this);
    }
}
