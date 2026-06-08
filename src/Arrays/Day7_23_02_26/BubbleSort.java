package Arrays.Day7_23_02_26;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 3, 8, 2, 9, 1, 0};
        System.out.println("before : " + Arrays.toString(arr));
        bubbleSortAsc(arr, arr.length);
        System.out.println("BubbleSortAsc : " + Arrays.toString(arr));
        bubbleSortDsc(arr, arr.length);
        System.out.println("BubbleSortDsc : " + Arrays.toString(arr));
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
