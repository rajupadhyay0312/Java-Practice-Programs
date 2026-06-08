package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;

public class PalindromicPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        int den = 2;
        while(den<=num/2){
            if(num%den==0){
                break;
            }
            den++;
        }
        int rev = 0;
        while(num!=0){
            rev = rev*10+num%10;
            num/=10;
        }
        den=2;
        while (den <= rev / 2)
        {
            if (rev % den == 0)
            {
                break;
            }
            den++;
        }
        if (den > rev /2)
        {
            System.out.println("It is Palindromic prime Number");
        } else
        {
            System.out.println("It is not Palindromic prime number");
        }

    }
}
