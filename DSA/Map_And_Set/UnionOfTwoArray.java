package Map_And_Set;

import java.util.HashSet;

public class UnionOfTwoArray {

    public static void findUnionOfTwoArray(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }

        System.out.println(set);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 3 };
        int arr2[] = { 1, 2, 4, 5, 4, 6 };

        findUnionOfTwoArray(arr, arr2);
    }
}
