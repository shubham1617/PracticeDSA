package Sorting;

import java.util.Arrays;

public class NewSelectionSort {
    public static void main(String[] args) {
        int[]arr= {3,1,5,4,2,-9,0,-100};
        //selectionSort(arr);
        newSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void newSelectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swapArray(arr,maxIndex,last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for(int i= max; i<=last;i++){
            if(arr[max] < arr[i]){
                max =i;
            }
        }
        return max;
    }

    static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
/*
    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int smallest =i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }*/





}
