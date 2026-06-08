package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Num :");
        int num = sc.nextInt();
        int temp = num;

        if(num==1){
            System.out.println("It is not a prime");
        }
        else {
            int den = 2;
            while (den <= num / 2)
            {
                if (num % den == 0)
                {
                    break;
                }
                den++;
            }
            if (den > num / 2) {
                int rev = 0;

                while (num != 0) {
                    rev = rev * 10 + (num % 10);
                    num/=10;
                }
                den = 2;

                while (den <= rev / 2)
                {
                    if (rev % den == 0)
                    {
                        break;
                    }
                    den++;
                }
                if (den > rev / 2)
                {
                    System.out.println("It is twisted prime Number");
                } else
                {
                    System.out.println("It is not twisted prime number");
                }
            }
            else{
                System.out.println("Not a prime number");
            }
        }
    }
}
