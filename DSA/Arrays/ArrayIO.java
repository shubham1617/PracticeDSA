package Arrays;

import java.util.Scanner;

public class ArrayIO {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];

        // Taking the number in array
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        // Printing the number
        for (int i = 0; i < number.length; i++) {
            System.out.println("Entered number is: " + number[i]);
        }

        sc.close();
    }
}
