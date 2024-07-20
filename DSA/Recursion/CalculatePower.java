package Recursion;

public class CalculatePower {
    public static int calPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpow = calPow(x, n - 1);
        int pow = x * xpow;
        return pow;
    }

    public static void main(String[] args) {
        int x = 2, n = 3;
        int calPow = calPow(x, n);
        System.out.println(calPow);
    }
}
