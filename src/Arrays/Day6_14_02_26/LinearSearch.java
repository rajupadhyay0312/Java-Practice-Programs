package Arrays.Day6_14_02_26;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        int key = 5;
        //int pos = linearSearchRecursion(arr,key,0);
        int pos = linearSearchIterative(arr, key);
        if (pos != -1)
            System.out.println("Key " + key + " found at " + pos);
        else
            System.out.println("Key " + key + " not found");
    }

    private static int linearSearchRecursion(int[] arr, int key, int i) {
        if (i == arr.length) return -1;
        if (arr[i] == key) return i;
        return linearSearchRecursion(arr, key, ++i);
    }

    private static int linearSearchIterative(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
}
