package Sorting;

//In Selection sort first we assume that at 0th index element is smallest and then 
//we check with the next element for smaller that that if we found that next element is smallest 
//then we make that element smallest and store it the first index. 
public class SelectionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int array[] = { 7, 88, 5, 6, 42, 99 };

        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }

            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }

        printArray(array);
    }
}
