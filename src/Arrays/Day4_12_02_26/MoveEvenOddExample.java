package Arrays.Day4_12_02_26;

import java.util.Arrays;

public class MoveEvenOddExample {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,8,6,5,7};
        System.out.println(Arrays.toString(arr));
        for(int i=0,j=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                int temp = arr[i];
                int k=i;
                while(k>j){
                    arr[k]=arr[k-1];
                    k--;
                }
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}