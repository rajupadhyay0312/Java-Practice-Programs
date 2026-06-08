package Arrays.Day4_12_02_26;

import java.util.Arrays;
public class CheckArray_Sorted_And_Rotated {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }
        // Check last and first element
        if (arr[arr.length - 1] > arr[0]) {
            count++;
        }
        if (count <= 1) {
            System.out.println("Array is sorted and rotated");
        } else {
            System.out.println("Array is NOT sorted and rotated");
        }
    }
}
