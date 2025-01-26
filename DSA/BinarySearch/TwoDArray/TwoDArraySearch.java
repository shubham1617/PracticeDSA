package BinarySearch.TwoDArray;


import java.util.Arrays;

public class TwoDArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        int target = 80;

        int[] result = findInTwoDArray(arr,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findInTwoDArray(int[][] arr,int target) {
        int row =0;
        int col= arr.length-1;

        while(row < arr.length && col>=0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            if(arr[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }

}
