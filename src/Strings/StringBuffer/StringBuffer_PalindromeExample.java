package Strings.StringBuffer;

import java.util.Scanner;

public class StringBuffer_PalindromeExample {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        String str = new Scanner(System.in).next();

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(str.contentEquals(sb)?" Palindrome":" not palindrome");
    }
}
