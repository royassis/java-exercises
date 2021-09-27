package exercise;

// Write a Java program to reverse a given linked list
public class Ex121 {
    public static void main(String[] args) {
        class Node {
            Node next;
            final int val;

            public Node(int newVal) {
                val = newVal;
            }

            public void add(Node nextNode) {
                this.next = nextNode;
            }
        }

        class LinkedList {
            Node root = null;
            Node tail = null;

            public LinkedList(Node newRoot) {
                root = newRoot;
                tail = newRoot;
            }

            public void add(Node nextNode) {
                this.tail.add(nextNode);
                this.tail = nextNode;
            }

            public void printLinkedList() {
                Node node = this.root;
                while (node != null) {
                    System.out.println(node.val);
                    node = node.next;
                }
            }

            public void revList() {
                Node prevNode = this.root;
                Node currentNode = this.root.next;
                this.root = this.tail;
                this.tail = prevNode;
                prevNode.next = null;

                while (currentNode != null) {
                    Node nextNode = currentNode.next;
                    currentNode.next = prevNode;
                    prevNode = currentNode;
                    currentNode = nextNode;
                }
            }
        }

        LinkedList ll = new LinkedList(new Node(2));
        ll.add(new Node(3));
        ll.add(new Node(20));

        ll.printLinkedList();

        ll.revList();
        ll.printLinkedList();

    }
}