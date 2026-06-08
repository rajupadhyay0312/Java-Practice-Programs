package Arrays.Day7_23_02_26;

import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {6,3,9,8,2,5};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int si,int ei){
         if(si>=ei){
             return;
         }
        int pIndex = partition(arr,si,ei);
        quickSort(arr,si,pIndex-1);//left
        quickSort(arr,pIndex+1,ei);//right
    }
    public static int  partition(int [] arr, int si, int ei){
       int pivot = arr[ei];
       int i=si-1;// to make a place for element smaller than pivot

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
}
