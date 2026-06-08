package Arrays.Day5_13_02_26;

import java.util.Arrays;
import java.util.Scanner;

public class Freq_Dist_Dup_Unique_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        frequencyCharacter(str);
        System.out.println("Distinct: "+distinctCharacter(str));
        System.out.println("Duplicate: "+duplicateCharacter(str));
        System.out.println("Unique: "+UniqueCharacter(str));
    }

    public static void frequencyCharacter(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
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

    public static String distinctCharacter(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        boolean[] b = new boolean[arr.length];
        String op = "";
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    b[j] = true;
                }
            }
            op += arr[i]+" ";
        }
        return op;
    }

    public static String duplicateCharacter(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        boolean[] b = new boolean[arr.length];
        String dup = "";
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
                dup += arr[i]+" ";
        }
        return dup;
    }

    public static String UniqueCharacter(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        boolean[] b = new boolean[arr.length];
        String unique = "";
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    b[j] = true;
                }
            }
            if (cnt == 1) unique += arr[i]+" ";
        }
        return unique;
    }
}
