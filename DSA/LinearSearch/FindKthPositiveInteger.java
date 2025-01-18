package DSA.LinearSearch;

import java.util.ArrayList;
import java.util.List;

public class FindKthPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
       int x = findKthPositive(arr,k);
        System.out.println(x);
    }
    static int findKthPositive(int[] arr, int k) {
        for (int j : arr) {
            if (j <= k) {
                k++;
                break;
            }
        }
        return k;
    }
}
