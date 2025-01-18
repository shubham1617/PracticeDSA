package DSA.LinearSearch;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2= {2,2};
        System.out.println(Arrays.toString(intersection(num1,num2)));
    }


    static int[] intersection(int[] num1, int[] num2) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele1 : num1){
            for(int ele2 : num2){
                if(ele1 == ele2){
                    set.add(ele1);
                    break;
                }
            }
        }
        if(set.isEmpty()){
            return new int[] {};
        }

        int[] array = new int[set.size()];
        int i=0;
        for(int value : set){
            array[i++] = value;
        }
        return  array;


    }
}
