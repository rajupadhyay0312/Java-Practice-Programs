package Strings;

import java.util.Scanner;

public class CountNumberOfWordsStartingWithVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String str = sc.nextLine();
        countWordStartingVowel(str);
    }

    public static void countWordStartingVowel(String str){
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0 || str.charAt(i - 1) == ' ') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    cnt++;
                }
            }
        }
        System.out.println("count of word starting with vowel: "+cnt);
    }
}
