package Arrays.Day6_14_02_26;

import java.util.Arrays;

public class ExponentialSearchIterativeExp {
    public static void main(String[] args) {
        int [] arr = new int[20];
        for(int i=1; i<=arr.length;i++){
            arr[i-1]=i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(exponentialSearch(arr,15,arr.length));
    }
    public static int exponentialSearch(int[] arr,int key, int n){
        if(arr[0]==key) return 0;
        int i=1;
        while(i<n && key>arr[i])
            i*=2;
        return binarySearch(arr,key,i/2,Math.min(i,n));
    }
    public static int binarySearch(int [] arr,int key, int min,int max){
        while(min<=max){
            int mid = min+(max-min)/2;
            if(key<arr[mid]) max = mid-1;
            else if(key>arr[mid]) min=mid+1;
            else return mid;
        }
        return -1;
    }
}
