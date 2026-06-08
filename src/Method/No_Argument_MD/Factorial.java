package Method.No_Argument_MD;

import java.util.Scanner;

public class Factorial {
    static long num;
    static long fact;
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = sc.nextInt();

        factorialOfNum();
        System.out.print("factorial is : "+fact);
    }
    public static void factorialOfNum(){
        fact=1;
        for(long i =1; i<=num; i++)
            fact *= i;
    }
}
