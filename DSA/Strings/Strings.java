package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Declaration of string
        String name = "Shubham";
        // Printing name
        System.out.println(name);

        // Diff between next() and nextLine()
        // System.out.print("Enter the name:");
        // Scanner sc = new Scanner(System.in); // Input--> Navin Kumar
        // String fullInput = sc.nextLine(); // This will print full line -- Output -->
        // Navin Kumar
        // // String nameInput = sc.next(); // This will only print first word -- Output
        // // --> Navin
        // // System.out.println(nameInput);
        // System.out.println(fullInput);

        // Basic operations on String
        // Contactination
        // String firstName = "Ank";
        // String lastName = "Kumar";
        // // String fullName = firstName + " " + lastName;
        // // System.out.println(fullName);
        // String concat = firstName.concat(lastName);
        // System.out.println(concat);

        // Length of an array
        String lengthString = "shubham";
        int length = lengthString.length();
        System.out.println(length);

        // CharAt()
        for (int i = 0; i < length; i++) {
            System.out.println(lengthString.charAt(i));
        }

        // compareTo()
        // +ve means greater than
        // -ve means less than
        // 0 means equal
        int compareTo = name.compareTo(lengthString);
        System.out.println(compareTo);

        String subStringTest = "My*name*is*Shubham*Kumar";
        String substring = subStringTest.substring(1, 7);
        System.out.println(substring);

    }
}
