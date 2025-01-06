package DSA.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 4, 5},
                {23, 43, 64, 78, 88, 6},
                {24, 54, 7, 68, 98}};

        int target = 78;

        int[] search = search(arr, target);
        System.out.println(Arrays.toString(search));
//        int max = max(arr);
//        System.out.println(max);
    }

    static int max(int[][] arr) {
        int maximum = Integer.MIN_VALUE;
        for (int[] array : arr) {
            for (int a : array) {
                if (a > maximum) {
                    maximum = a;
                }
            }
        }
        return maximum;
    }

    static int[] search(int[][] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }


}
