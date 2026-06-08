package Arrays.Day4_12_02_26;

import java.util.Arrays;

public class MovesZeroToTheEnd {
    public static void main(String[] args) {
        int[] arr = {4,0,3,0,2,1,0,7};
        System.out.println(Arrays.toString(arr));
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]!=0){
                arr[j] =arr[i];
                j++;
            }
            i++;
        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
