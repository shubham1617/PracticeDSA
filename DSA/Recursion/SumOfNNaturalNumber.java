package Recursion;

public class SumOfNNaturalNumber {
    public static void printNumb(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printNumb(i + 1, n, sum);
        System.out.println(i);
    }

    public static void main(String[] args) {
        printNumb(1, 5, 0);
    }
}
