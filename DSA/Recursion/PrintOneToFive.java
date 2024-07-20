package Recursion;

/**
 * PrintOneToFive
 */
public class PrintOneToFive {

    public static void printNum(int num) {
        if (num == 6) {
            return;
        }
        System.out.println(num);
        printNum(num + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }
}