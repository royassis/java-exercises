package exercise;

import ads.linkedlist.*;

public class Ex175 {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        for (int x : utils.Utils.getRandomArr(4,1,9)) {
            ll.add(x);
        }

        System.out.println(ll);

        ll.removeByIndex(2);

        System.out.println(ll);
    }
}
