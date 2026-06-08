package Arrays.Day5_13_02_26;

import java.util.Scanner;

public class Freq_Dist_Dup_Unique_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word: ");
        String str = sc.nextLine();
        frequencyWord(str);
        System.out.println("Distinct: "+removeDuplicateWord(str));
        System.out.println("Duplicate: "+duplicateWord(str));
        System.out.println("Unique: "+UniqueWord(str));
    }

    public static void frequencyWord(String str) {
        String[] arr = str.split(" ");
        boolean[] b = new boolean[arr.length];
        System.out.println("Frequency Of Element : ");
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    cnt++;
                    b[j] = true;
                }
            }
            System.out.println(arr[i] + " : " + cnt);
        }
    }

    public static String removeDuplicateWord(String str) {
        String[] arr = str.split(" ");
        boolean[] b = new boolean[arr.length];
        String op = "";
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    cnt++;
                    b[j] = true;
                }
            }
            op += arr[i]+" ";
        }
        return op.trim();
    }

    public static String duplicateWord(String str) {
        String[] arr = str.split(" ");
        boolean[] b = new boolean[arr.length];
        String dup = "";
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    cnt++;
                    b[j] = true;
                }
            }
            if (cnt > 1)
                dup += arr[i]+" ";
        }
        return dup.trim();
    }

    public static String UniqueWord(String str) {
        String[] arr = str.split(" ");
        boolean[] b = new boolean[arr.length];
        String unique = "";
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    cnt++;
                    b[j] = true;
                }
            }
            if (cnt == 1) unique += arr[i]+" ";
        }
        return unique.trim();
    }
}
