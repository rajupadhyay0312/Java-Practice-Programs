package Method.Parametrized_Argument;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        boolean op = isPrime(num);
        System.out.println(op?"is prime" : " not prime");
    }
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i = 2; i<=num/2; i++)
            if(num % i == 0) return false;

        return true;
    }
}
