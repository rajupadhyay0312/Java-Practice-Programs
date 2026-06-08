package Arrays.Day3_11_02_26;

import java.util.Arrays;

public class Smallest_LargestElementArrayExp1 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] =(int)(Math.random()*100);
        }
        int min = Integer.MAX_VALUE;
        for(int ele :  arr){
            if(min>ele) min = ele;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Smallest :- "+min);

        int max = Integer.MIN_VALUE;
        for(int ele :  arr){
            if(max<ele) max = ele;
        }
        System.out.println("Largest :- "+max);
    }
}
