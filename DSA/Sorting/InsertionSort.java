package Sorting;

public class InsertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = { 7, 88, 5, 6, 42, 99 };

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current <= array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }

        printArray(array);
    }
}
