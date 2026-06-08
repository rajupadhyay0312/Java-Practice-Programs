package Arrays.LeetCodeExample;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(arr));
       int[] result =  twoSum(arr,9);
        System.out.println(Arrays.toString(result));
    }
    public static int [] twoSum(int [] arr,int target){
        if(arr.length==2) return new int[]{0,1};
        int [] a = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
    }
}
