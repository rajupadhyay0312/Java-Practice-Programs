package Arrays.Day4_12_02_26;

import java.util.*;
public class RotateOnlyFirstHalf {
        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 5, 6};
            System.out.println("Original: " + Arrays.toString(arr));

            int n = arr.length;
            int mid = n / 2;

            // Store last element of first half
            int temp = arr[mid - 1];

            // Shift elements of first half to right
            for (int i = mid - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            // Place stored element at beginning
            arr[0] = temp;

            System.out.println("After Rotation: " + Arrays.toString(arr));
        }
    }

