package ads.linkedlist;

public class LinkedList {

    Node head = null;
    Node tail = null;
    Integer size = 0;

    public LinkedList(Integer n) {
        head = new Node(n);
        tail = head;
        size = 1;
    }

    public LinkedList() {

    }

    public  static void switchNextAdjacentNodes(Node node0){
        if (!node0.hasNext() || !node0.getNext().hasNext()){
            return;
        }

        // switches node 1 and 2
        Node node1 = node0.getNext();
        Node node2 = node0.getNext().getNext();
        Node node3 = node0.getNext().getNext().getNext();

        node0.setNext(node2);
        node2.setNext(node1);
        node1.setNext(node3);
        
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
        if (this.getHead() != null) {
            tail.next = newNode;
            tail = newNode;
        } else {
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
        } else if (i == 0) {
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

    public static void printLinkedList(LinkedList ll) {
        Node currentNode = ll.getHead();

        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNext();
        }
    }

    public void printLinkedList() {
        printLinkedList(this);
    }

    @Override
    public String toString() {
        String str = "";
        Node currentNode = this.getHead();
        while (currentNode != null) {
            str = str + currentNode + ", ";
            currentNode = currentNode.getNext();
        }
        str = str.substring(0, str.length() - 2);
        str = String.format("LinkedList [%s]", str);
        return str;
    }
}
