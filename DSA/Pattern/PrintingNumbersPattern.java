package Pattern;

public class PrintingNumbersPattern {

    public static void main(String[] args) {

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        // for (int i = 5; i >= 0; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // int count = 1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(count++ + " ");
        // }
        // System.out.println();
        // }

        // 0
        // 1 0
        // 0 1 0
        // 1 0 1 0
        // 0 1 0 1 0

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                // int sum=i+j;
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
