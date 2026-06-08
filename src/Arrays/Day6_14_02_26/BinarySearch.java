package Arrays.Day6_14_02_26;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 9;
        //int pos = binarySearchIterative(arr,arr.length,key);
        int pos = binarySearchRecursion(arr, key, 0, arr.length - 1);
        if (pos != -1) {
            System.out.println("Key " + key + " found at " + pos);
        } else {
            System.out.println("Key " + key + " Not found. ");
        }
    }

    public static int binarySearchIterative(int[] arr, int n, int key) {
        int min = 0;
        int max = n - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (key < arr[mid]) max = mid - 1;
            else if (key > arr[mid]) min = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] arr, int key, int min, int max) {
        if (min > max) return -1;
        int mid = min + (max - min) / 2;
        if (key < arr[mid]) return binarySearchRecursion(arr, key, min, mid - 1);
        else if (key > arr[mid]) return binarySearchRecursion(arr, key, mid + 1, max);
        else return mid;

    }

}
