package Arrays.LeetCodeExample;

import java.util.Arrays;
public class SingleNumber {
    public static void main(String[] args) {
        int [] nums={4,2,1,2,1};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] arr){
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}
