package Arrays.Day6_14_02_26;

import java.util.Arrays;
public class TernarySearchRecursionExp {
    public static void main(String[] args) {
        int [] arr = new int[20];
        for(int i=0; i<arr.length;i++){
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
        int key =14;
        int pos = ternarySearchRecursion(arr,key,0,arr.length-1);
        if(pos!=0){
            System.out.println("key "+key+" found at "+pos);
        }else{
            System.out.println("key "+key+" Not found");
        }
    }
    public static int ternarySearchRecursion(int[] arr, int key,int min, int max){
        if(min>max) return -1;
        int mid1 = min+(max-min)/3;
        int mid2 = max-(max-min)/3;
        if(key==arr[mid1]) return mid1;
        if(key == arr[mid2]) return mid2;
        if(key<arr[mid1]) return ternarySearchRecursion(arr,key,min,mid1-1);
        else if(key>arr[mid2]) return ternarySearchRecursion(arr,key,mid2+1,max);
        else return ternarySearchRecursion(arr,key,mid1+1,mid2-1);
    }
}
