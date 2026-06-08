package Arrays.Day5_13_02_26;

import java.util.*;
public class SortElementAsPerFrequency {
    public static void main(String[] args) {

        int arr[] = {4, 5, 3, 4, 3, 4, 5, 1, 2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int count1 = 0, count2 = 0;

                for (int k = 0; k < n; k++) {
                    if (arr[i] == arr[k]) count1++;
                    if (arr[j] == arr[k]) count2++;
                }

                // sort by frequency, then by value
                if (count1 > count2 || (count1 == count2 && arr[i] > arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
