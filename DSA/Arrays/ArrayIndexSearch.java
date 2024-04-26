package Arrays;

import java.util.Scanner;

public class ArrayIndexSearch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 3, 5, 4, 9, 22 };

        System.out.println("Enter the number to be serach: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Present at index: " + i);
            }
        }

    }
}
