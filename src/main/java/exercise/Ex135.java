package exercise;

import linkedlist.LinkedList;
/*
Write a Java program to find the distinct ways you can climb to the top (n steps to reach to the top) of stairs.
Each time you can either climb 1 or 2 steps.
*/
import linkedlist.Node;

public class Ex135 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        removeDuplicatesFromSortedLinkedList(ll);

        System.out.println(ll);

    }

    static void removeDuplicatesFromSortedLinkedList(LinkedList ll) {
        Node currentNode = ll.getHead();
        Node firstNodeInStrip = currentNode;

        while (currentNode != null) {
            if (firstNodeInStrip.getVal() != currentNode.getVal()) {
                firstNodeInStrip.setNext(currentNode);
                firstNodeInStrip = currentNode;
            }
            currentNode = currentNode.getNext();
        }
    }

}