package DSA.LinearSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormToInteger {
    public static void main(String[] args) {
        int[] num ={1,2,0,0};
        int k=34;
        System.out.println(addToArray(num,k));
    }

//    static List<Integer> addToArray(int[] num, int k) {
//        int sum =0;
//        LinkedList<Integer> list = new LinkedList<>();
//        for(int i =0;i<num.length;i++){
//            sum=sum*10 + num[i];
//        }
//        sum = sum + k;
//
//        while(sum>0){
//            list.push(sum%10);
//            sum = sum/10;
//        }
//
//        return list;
//
//    }

    public static List<Integer> addToArray(int[] num, int k) {
        LinkedList<Integer> list = new LinkedList<>();

        // Start from the end of the num array (the least significant digit)
        int n = num.length;
        for (int i = n - 1; i >= 0 || k > 0; i--) {
            if (i >= 0) {
                k += num[i];  // Add the digit num[i] to k
            }

            // Push the current digit of the sum to the list (current digit = k % 10)
            list.addFirst(k % 10);  // Add the least significant digit of k
            k /= 10;  // Carry forward (integer division by 10)
        }

        return list;
    }
}
