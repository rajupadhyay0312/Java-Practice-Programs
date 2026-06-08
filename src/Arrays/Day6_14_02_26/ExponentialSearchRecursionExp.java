package Arrays.Day6_14_02_26;

import java.util.Arrays;

public class ExponentialSearchRecursionExp {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(exponentialSearchRecursion(arr, 15, arr.length - 1));
    }

    public static int exponentialSearchRecursion(int[] arr, int key, int n) {
        if (arr[0] == key) return 0;
        return expandRange(arr, key, 1, n);
    }

    //Recursive replacement of while loop
    public static int expandRange(int[] arr, int key, int i, int n) {
        if (i >= n || key <= arr[i])
            return binarySearchRecursion(arr, key, i / 2, Math.min(i, n - 1));
        return expandRange(arr, key, i*= 2, n);
    }

    //Recursive Binary Search
    public static int binarySearchRecursion(int[] arr, int key, int min, int max) {
        if (min > max) return -1;
        int mid = min + (max - min) / 2;
        if (key < arr[mid]) return binarySearchRecursion(arr, key, min, mid - 1);
        else if (key > arr[mid]) return binarySearchRecursion(arr, key, mid + 1, max);
        else return mid;
    }

}
