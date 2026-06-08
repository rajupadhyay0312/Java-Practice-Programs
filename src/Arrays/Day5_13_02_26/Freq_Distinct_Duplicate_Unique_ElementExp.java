package Arrays.Day5_13_02_26;

import java.util.Arrays;

public class Freq_Distinct_Duplicate_Unique_ElementExp {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 5, 6, 7, 8, 2, 4, 8, 11};
        System.out.println("Original Array : " + Arrays.toString(arr));
        frequencyElement(arr);
        System.out.println();
        distinctElement(arr);
        System.out.println();
        duplicateElement(arr);
        System.out.println();
        UniqueElement(arr);
    }

    public static void frequencyElement(int[] arr) {
        boolean[] b = new boolean[arr.length];
        System.out.println("Frequency Of Element : ");
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    b[j] = true;
                }
            }
            System.out.println(arr[i] + " : " + cnt);
        }
    }

    public static void distinctElement(int[] arr) {
        boolean[] b = new boolean[arr.length];
        System.out.println("Distinct Element: ");
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    b[j] = true;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void duplicateElement(int[] arr) {
        boolean[] b = new boolean[arr.length];
        System.out.println("duplicate Element: ");
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    b[j] = true;
                }
            }
            if (cnt > 1)
                System.out.print(arr[i] + " ");
        }
    }

    public static void UniqueElement(int[] arr) {
        boolean[] b = new boolean[arr.length];
        System.out.println("Unique Element: ");
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    b[j] = true;
                }
            }
            if (cnt == 1)
                System.out.print(arr[i] + " ");
        }
    }

}