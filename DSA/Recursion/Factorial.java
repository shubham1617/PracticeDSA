package Recursion;

/**
 * Factorial
 */
public class Factorial {

    public static int printNumb(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int fact = printNumb(n - 1);
        int fact_n = n * fact;
        return fact_n;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printNumb(n));
    }
}