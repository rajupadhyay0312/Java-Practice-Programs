package Arrays.LeetCodeExample;

import java.util.Arrays;

public class PlusOneExample {
    public static void main(String[] args) {
        int [] digits = {1,2,3};
        System.out.println(Arrays.toString(digits));
        int[] result = onePlus(digits);
        System.out.println(Arrays.toString(result));

    }
    public static int[] onePlus(int [] arr){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] newArr = new int[arr.length+1];
        newArr[0]=1;
        return newArr;
    }
}