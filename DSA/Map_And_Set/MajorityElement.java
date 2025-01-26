package Map_And_Set;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void findMajorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // checking for number to be present
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // traversing map
        // for (Map.Entry<Integer, Integer> e : map.entrySet()) {
        // if (e.getValue() >= nums.length / 3) {
        // System.out.println(e.getKey());
        // }
        // // System.out.println(e.getKey());
        // }

        // Another way to traversing
        for (int key : map.keySet()) {
            if (map.get(key) >= nums.length / 3) {
                System.out.println(key);
            }
            // System.out.println(key + " " + map.get(key));
        }

    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        // int nums[] = { 1, 2 };
        findMajorityElement(nums);
    }
}
