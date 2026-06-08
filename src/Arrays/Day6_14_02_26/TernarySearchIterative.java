package Arrays.Day6_14_02_26;

import java.util.Arrays;

public class TernarySearchIterative {
    public static void main(String[] args) {
        int [] arr = new int[20];
        for(int i=0; i<arr.length; i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        int key  = 12;
        int pos = ternarySearchIterative(arr,key, arr.length-1);
        if(pos!=-1){
            System.out.println("key "+key+" Found at "+pos);
        } else {
            System.out.println("key "+key+" Not Found ");
        }
    }
    public static int ternarySearchIterative(int[] arr,int key, int n){
        int min =0,max=n;
        while(min<=max){
            int mid1 = min+(max-min)/3;
            int mid2 = max-(max-min)/3;

            if(key==arr[mid1]) return mid1;
            if(key==arr[mid2]) return mid2;
            if(key<arr[mid1]) {
                max= mid1-1;
            }
            else if (key>arr[mid2]) {
                min= mid2+1;
            }else {
                min = mid1 + 1;
                max = mid2 - 1;
            }
        }
        return -1;
    }
}
