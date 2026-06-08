package Arrays.Day6_14_02_26;

import java.util.Arrays;

public class BubbleSortAscDscExp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Before: "+Arrays.toString(arr));
        bubbleSortAsc(arr, arr.length);
        System.out.println("Asc: "+Arrays.toString(arr));
        bubbleSortDsc(arr, arr.length);
        System.out.println("Desc: "+Arrays.toString(arr));
    }
    public static void bubbleSortAsc(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSortDsc(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
