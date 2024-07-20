package Pattern;

import java.util.Scanner;

public class RectanglePattern {

    // Output
    /*
     * 
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * 
     */

    // Lets take the input from the user

    public static void main(String[] args) {
        System.out.print("Enter the size of rectangle:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        // Lets nextInt=5
        // When length and breadth is different
        // for (int i = 1; i <= rows; i++) {
        // for (int j = col; j > 0; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // When length and breath is same
        // for (int i = 0; i < rows; i++) {
        // for (int j = rows; j > 0; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
