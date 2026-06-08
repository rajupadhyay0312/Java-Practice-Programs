package Arrays.Day4_12_02_26;

import java.util.Arrays;

public class CheckArraySorted_OR_Not {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,6,7};
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]) {
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("Array is sorted");
    }
}
