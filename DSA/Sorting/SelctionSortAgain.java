package Sorting;

public class SelctionSortAgain {
    public static void main(String[] args) {

        int[] arr = { 7, 8, 3, 2, 9 };
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Sorted Array using Selection Sort: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
