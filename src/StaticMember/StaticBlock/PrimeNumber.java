package StaticMember.StaticBlock;

import java.util.Scanner;

public class PrimeNumber {
    static{
        System.out.println("Static block");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if(isPrime(num))
            System.out.println(num+" is prime");
        else
            System.out.println(num+" is not prime");
        System.exit(0);
    }
    public static boolean isPrime(int num){
        if(num<2)
            return false;

        for(int i=2; i<=num/2; i++)
            if(num%i==0)
                return false;

        return true;
    }
}
