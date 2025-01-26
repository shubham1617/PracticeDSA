package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int array[] = { -20,7, 88, 5, 6, 42, 99,0 };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) { // if we change this to < then it should be decending order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }



}
