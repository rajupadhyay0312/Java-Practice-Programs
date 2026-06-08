package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int ans = 0;

        for(int i = num; i!=0; i/=10){
            ans =  ans*10+(i%10);
        }
        if(num==ans){
            System.out.println("Is a Palindrome");
        }
        else{
            System.out.println("Is not a Palindrome");
        }
    }
}
