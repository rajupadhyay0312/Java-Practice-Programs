package Arrays.Day4_12_02_26;

import java.util.Arrays;

public class ReverseOnlyOddElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]%2==0){
                i++;
            }
            else if(arr[j]%2==0){
                j--;
            }
            //swap odd number
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
