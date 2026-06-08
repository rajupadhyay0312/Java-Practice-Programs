package Arrays.LeetCodeExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberDisappearedArray {
    public static void main(String[] args) {
        int [] arr ={4,3,2,7,8,2,3,1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        List<Integer> result = findDisappearedNumbers(arr);
        System.out.println("Missing Numbers: " + result);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] present = new boolean[nums.length];
        for(int i=0; i<nums.length; i++){
            int number = nums[i];
            present[number-1]=true;
        }
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(present[i] == false)
                list.add(i+1);
        }
        return list;
    }
}
