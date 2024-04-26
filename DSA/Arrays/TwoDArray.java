package Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int numbers[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered Matrix");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Seraching in given array for a number and print its indices

        System.out.println("Entered the number to be searched :");
        int serachNumber = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == serachNumber) {
                    System.out.println("Number is present " + "(" + i + "," + j + ")");
                }
            }

        }

    }
}
