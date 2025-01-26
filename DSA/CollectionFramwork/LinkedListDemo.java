package CollectionFramwork;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        // 3 types of linked list
        // --Singular --DoublyEnded --Circular

        // Single LinkedList

        // Create linkedlist
        LinkedList<String> ll = new LinkedList<>();

        // add linked list
        ll.add("Shubham");
        ll.add("Athina");
        ll.add("Ankit");
        ll.add("Navin");
        System.out.println(ll);

        // add first
        ll.addFirst("Babita");
        System.out.println(ll);

        // add last
        ll.addLast("Barsha");
        System.out.println(ll);

        // print size
        int size = ll.size();
        System.out.println(size);

        // Iterate over list
        // for (String print : ll) {
        // System.out.println(print);
        // }
        // for (int i = 0; i < ll.size(); i++) {
        // System.out.println(ll.get(i));
        // }

        // remove first
        ll.removeFirst();
        System.out.println(ll);

        // remove last
        ll.removeLast();
        System.out.println(ll);

        // remove at any index
        ll.remove(3);
        System.out.println(ll);
    }
}
