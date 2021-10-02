package exercise;

import ads.linkedlist.*;

public class Ex180 {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        for (int x : utils.Utils.getRandomArr(5,1,9)) {
            ll.add(x);
        }

        System.out.println(ll);

        // switches root
        Node node0 = ll.getHead();
        Node node1 = node0.getNext();
        Node node2 = node0.getNext().getNext();

        ll.setHead(node1);
        node1.setNext(node0);
        node0.setNext(node2);

        Node prevNode = ll.getHead().getNext();
        Node currentNode = ll.getHead().getNext().getNext();

        while (currentNode != null && currentNode.hasNext()){
            prevNode.setNext(currentNode.getNext());
            Node tmp = currentNode.getNext().getNext();
            currentNode.getNext().setNext(currentNode);
            currentNode.setNext(tmp);

            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }

        ll.setTail(currentNode);

        System.out.println(ll);

    }
}
