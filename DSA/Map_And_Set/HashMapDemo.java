package Map_And_Set;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Shubham");
        map.put(2, "Athina");
        map.put(3, "Mummy");
        map.put(4, "Barsha");

        System.out.println(map);

        map.put(1, "Navin");

        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.containsKey(1));

        map.remove(1);
        System.out.println(map);

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
