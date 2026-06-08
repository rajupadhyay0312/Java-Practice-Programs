package Arrays.Day7_23_02_26;

import java.util.Arrays;

public class InsertionSortRecursion {
    public static void main(String[] args) {
        int [] arr = {5,4,1,3,2};
        System.out.println(Arrays.toString(arr));
        insertionRecursion(arr,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionRecursion(int [] arr,int i){
         if(i==arr.length) return;
         int curr = arr[i];
         int prev = i-1;
         while(prev>=0 && arr[prev]>curr){
             arr[prev+1]=arr[prev];
             prev--;
         }
         arr[prev+1] = curr;

         insertionRecursion(arr,++i);
    }
}
