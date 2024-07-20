package Loops;

public class TypesOfLoop {

    public static void main(String[] args) {
        // For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop: " + i);
        }

        // While Loop
        int i = 1;
        while (i <= 5) {
            System.out.println("While Loop: " + i);
            i++;
        }

        // Do-While Loop
        int j = 1;
        do {
            System.out.println("Do While: " + j);
            j++;
        } while (j <= 5);
    }

}
