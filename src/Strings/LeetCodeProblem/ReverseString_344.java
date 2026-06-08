package Strings.LeetCodeProblem;

import java.util.Arrays;

public class ReverseString_344 {
    public static void main(String[] args) {
        String str = "hello";
        char[] ch = str.toCharArray();
        reverseString(ch);
    }

    public static void reverseString(char[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
