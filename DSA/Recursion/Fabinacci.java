package Recursion;

public class Fabinacci {
    public static void printNumber(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printNumber(b, c, n - 1);

    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 7;

        System.out.println(a);
        System.out.println(b);
        printNumber(a, b, n - 2);
    }
}
