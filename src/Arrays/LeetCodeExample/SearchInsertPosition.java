package Arrays.LeetCodeExample;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 2;
        System.out.println(Arrays.toString(nums));
        System.out.println(SearchInsertPos(nums,target));
    }
    public static int SearchInsertPos(int[] arr,int target){
        if(target>arr[arr.length-1]) return arr.length;
        if(target<arr[0]) return 0;
        int min = 0;
        int max = arr.length-1;
        int mid =0;
        while(min<=max){
            mid = min+(max-min)/2;
            if(target<arr[mid]) max = mid-1;
            else if(target>arr[mid]) min = mid+1;
            else return mid;
        }
        return min;
    }
}
