package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Basic operation
        // Add, Modify, Delete, Create

        ArrayList<Integer> arrayList = new ArrayList<>();
        // adding element in list
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);

        // Retrive element
        int integer = arrayList.get(2); // gives the element at index 2
        System.out.println(integer);

        // add element in between
        arrayList.add(1, 5);
        System.out.println(arrayList);

        // modify element
        arrayList.set(0, 10);
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

        System.out.println("Size of list: " + arrayList.size());

        // foreach loop
        arrayList.forEach((x) -> System.out.println(x));

        // sort the arrays
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
