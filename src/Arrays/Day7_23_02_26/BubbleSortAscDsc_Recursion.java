package Arrays.Day7_23_02_26;

import java.util.Arrays;

public class BubbleSortAscDsc_Recursion {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,2,7,4};
        System.out.println("Before : "+ Arrays.toString(arr));
        bubbleSortAscendingRecursion(0,arr);
        System.out.println("Asc Recursion : "+Arrays.toString(arr));
        bubbleSortDescendingRecursion(0,arr);
        System.out.println("Dsc Recursion : "+Arrays.toString(arr));

    }
    public static void bubbleSortAscendingRecursion(int i, int[] arr){
        if(i==arr.length-1) return;
        innerLoop(i,0,arr);
        bubbleSortAscendingRecursion(++i,arr);
    }
    public static void innerLoop(int i, int j, int[] arr){
        if(j==arr.length-1-i) return;
        if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
        innerLoop(i,++j, arr);
    }
    public static void bubbleSortDescendingRecursion(int i, int[] arr){
        if(i==arr.length-1) return;
        innerLoop1(i,0,arr);
        bubbleSortDescendingRecursion(++i,arr);
    }
    public static void innerLoop1(int i, int j, int[] arr){
        if(j==arr.length-1-i) return;
        if(arr[j]<arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
        innerLoop1(i,++j, arr);
    }
}
