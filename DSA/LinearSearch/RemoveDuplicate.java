package DSA.LinearSearch;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] num ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(num));
    }

    static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[i]){
                j++;
                nums[i] = nums[j];
            }
        }
        return j+1;
    }
}
