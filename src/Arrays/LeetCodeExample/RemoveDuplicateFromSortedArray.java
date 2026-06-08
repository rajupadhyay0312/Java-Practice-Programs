package Arrays.LeetCodeExample;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        System.out.println(Arrays.toString(nums));
        System.out.println(removeDuplicateArr(nums));
    }
    public static int removeDuplicateArr(int[] nums){
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==nums[j]){
                continue;
            }
            j++;
        }
        return j+1;
    }
}
