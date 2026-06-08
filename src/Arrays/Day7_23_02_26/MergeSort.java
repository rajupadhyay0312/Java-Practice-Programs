package Arrays.Day7_23_02_26;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {6,3,9,5,2,8};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int [] arr, int si, int ei){
        if(si>=ei){
            return;
        }
       int mid = si+(ei-si)/2;
        mergeSort(arr,si,mid);//left
        mergeSort(arr,mid+1,ei);//right
        merge(arr,si,mid,ei);
    }
    public static void merge(int [] arr,int si, int mid,int ei){
        int [] temp = new int[ei-si+1];
        int i=si; // index for first sorted part
        int j=mid+1; // index for second sorted part
        int k = 0; //index for temp;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for leftover elements of lst sorted part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for leftover elements of 2st sorted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
}
