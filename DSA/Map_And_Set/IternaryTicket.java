package Map_And_Set;

import java.util.HashMap;

public class IternaryTicket {

    public static String findStartingPoint(HashMap<String, String> map) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : map.keySet()) {
            revMap.put(map.get(key), key);
        }

        for (String key : map.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        System.out.println(map);

        String start = findStartingPoint(map);

        while (map.containsKey(start)) {
            System.out.print(start + " --> ");
            start = map.get(start);
        }
        System.out.print(start);

    }
}
