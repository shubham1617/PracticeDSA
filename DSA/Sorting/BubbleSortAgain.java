package Sorting;

public class BubbleSortAgain {

    public static void main(String[] args) {

        int[] arr = { 2, 5, 7, 3, 12, 9 };
        System.out.print("Unsorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // // accending order
                // if (arr[j] > arr[j + 1]) {
                // int temp = arr[j];
                // arr[j] = arr[j + 1];
                // arr[j + 1] = temp;
                // }

                // decending order
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
