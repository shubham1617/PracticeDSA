package Map_And_Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet
 */
public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(50);
        hashSet.add(10); // no duplicate allowed
        hashSet.add(79);
        hashSet.add(99);
        System.out.println(hashSet);

        // contain operator
        if (hashSet.contains(100)) {
            System.out.println("Contain");
        } else {
            System.out.println("Does not contain");
        }

        // remove operator
        hashSet.remove(99);
        System.out.println(hashSet);

        // size operator
        // System.out.println(hashSet.size());

        // Iterator
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}