package Strings;

import java.util.Scanner;

public class PrintNonRepeatingFirst {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a String:- ");//programming
        String str = sc.nextLine();
        FirstNonRepeatingCharacter(str);
    }
    public static void FirstNonRepeatingCharacter(String str){
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println("Last non repeating character: " + ch);
                break;
            }
        }
    }
}
