package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;

public class SumOfDigitOfNumIsPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num:");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){

            int digit = num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println("Sum of digit is :"+sum);

        int den = 2;
        while(den<sum)
        {
            if(sum%den==0)
            {
                break;
            }
            den++;
        }
        if(den==sum)
        {
            System.out.println("Sum of digit of a num is prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
