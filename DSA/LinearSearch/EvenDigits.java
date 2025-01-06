package DSA.LinearSearch;

public class EvenDigits {

    public static void main(String[] args) {
        int[]nums = {12,354,2,6,7896};
        int numbers = findNumbers(nums);
        System.out.println(numbers);
        System.out.println(digits(50000));
        System.out.println(shortcutDigits(50000));
    }


    //if the count of digits is even then return the number of even counts of numbers
    static int findNumbers(int[] arr) {
        int count = 0;
        int[] storeCount = new int[arr.length];
        for (int a : arr) {
            if (even(a)) {
                count++;
            }
        }
        return count;
    }

    //check if the count of digits is even or not
    private static boolean even(int a) {
        int numberOfDigits = digits(a);
        if(numberOfDigits % 2 ==0){
            return true;
        }
        return false;
    }

    //count the digits in a number
    static int digits(int a) {
        //checking for negetive number
        if(a<0){
            a =a * -1;
        }
        //checking for zero
        if(a==0){
            return 1;
        }
        int count =0;
        while(a> 0){
            count ++;
            a= a/10;
        }
        return count;
    }

    //shortcut to finding the count of digits of number
    static int shortcutDigits(int a){
        if(a<0){
            a = a * -1;
        }
        if(a==0){
            return 1;
        }
        return (int)Math.log10(a)+1;
    }


}
