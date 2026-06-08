package Arrays.Day6_14_02_26;

import java.util.Arrays;

public class SentinelSearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 7, 3, 8, 2, 9, 1};
        System.out.println(Arrays.toString(arr));
        int key = 1;
        //int pos = sentinelSearch(arr,key);
        int pos = sentinelSearchRecursion(arr, key);
        if (pos != -1) {
            System.out.println(pos);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int sentinelSearch(int[] arr, int key) {
        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = key;
        int i = 0;
        while (arr[i] != key)
            i++;
        arr[arr.length - 1] = temp;
        if (i < arr.length - 1 || arr[arr.length - 1] == key)
            return i;
        else return -1;
    }

    private static int sentinelSearchRecursion(int[] arr, int key) {
        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = key;
        int index = recursiveSearch(0, arr, key);
        arr[arr.length - 1] = temp;
        if (index < arr.length - 1 || temp == key)
            return index;

        return -1;
    }

    public static int recursiveSearch(int i, int[] arr, int key) {
        if (arr[i] == key)
            return i;
        return recursiveSearch(++i, arr, key);
    }
}
