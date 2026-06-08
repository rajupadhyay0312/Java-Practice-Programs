package Arrays.Day4_12_02_26;

import java.util.Arrays;

public class NumberOfRotation_In_SortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 2, 3};
        System.out.println(Arrays.toString(arr));
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Number of rotations: " + minIndex);
    }
}
/*
* Assume first element is minimum
  Traverse the array
  Update index when a smaller element appears
  Return that index
* */