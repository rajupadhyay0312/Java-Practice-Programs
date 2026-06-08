package Arrays.Day4_12_02_26;

import java.util.Arrays;

public class MissingElementSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        int missing = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i+1]-arr[i]>1){
                missing = arr[i]+1;
                break;
            }
        }
        System.out.println("Missing Element : "+missing);
    }
}
