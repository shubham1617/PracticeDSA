package Map_And_Set;

import java.util.HashSet;

public class InteresectionOfTwoArray {

    public static void findInteractionOfTwoArray(int arr1[], int arr2[]) {

        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                count++;
                // to print the intersection elecment
                // System.out.print(arr2[j] + " ");
                set.remove(arr2[j]);
            }
        }

        // to print the count
        // System.out.println(count);
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        findInteractionOfTwoArray(arr1, arr2);
    }
}
