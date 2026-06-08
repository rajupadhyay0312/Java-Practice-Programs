package Arrays.Day4_12_02_26;

import java.util.Arrays;
public class ReverseOnlyEvenIndexArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int j = arr.length % 2 == 0 ? arr.length - 2 : arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 2;
            j -= 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
