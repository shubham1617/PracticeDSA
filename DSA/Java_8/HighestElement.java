package Java_8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HighestElement {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 9 };
        // Arrays.sort(arr);
        int highest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }

    }
    // 3rd highest element

}
