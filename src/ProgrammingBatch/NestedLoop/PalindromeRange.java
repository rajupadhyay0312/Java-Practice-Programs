package ProgrammingBatch.NestedLoop;

import java.util.Scanner;

public class PalindromeRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number : ");
        int start = sc.nextInt();
        System.out.print("Enter end Number : ");
        int end = sc.nextInt();

        while(start<=end){
            int rev = 0, temp=start;
            while(temp!=0){
                rev = rev * 10 + temp%10;
                temp/=10;
            }
            if(start == rev){
                System.out.println(start);
            }
            start++;
        }
    }
}
