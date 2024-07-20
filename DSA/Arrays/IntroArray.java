package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntroArray {

    public static void main(String[] args) {

        int[] arr; // declaration of array. arr created in stack
        arr = new int[5]; // initialisation: here new object is created in heap
        // System.out.println(arr[0]); // return 0 because we dont define any values

        // String[] str = new String[5];
        // System.out.println(str[0]); // return null because its empty and its type of
        // string

        // We cant assign null into int but in string we can assign it

        Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        // First way to print array
        // for (int ele : arr) {
        // System.out.print(ele);
        // }

        // Second way of printing object
        // System.out.println(Arrays.toString(arr));

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

    }

}
