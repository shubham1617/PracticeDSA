package Arrays;

import java.util.Arrays;

public class PassInFunction {

    public static void main(String[] args) {

        int[] nums = { 1, 4, 6, 8, 94, 3 };
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

        // This shows that arrays is mutable in java we can change the value of array
    }

    public static void change(int[] arr) {
        arr[0] = 500;
    }
}
