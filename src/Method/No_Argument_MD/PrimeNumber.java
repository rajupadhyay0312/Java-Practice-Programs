package Method.No_Argument_MD;

import java.util.Scanner;

public class PrimeNumber {
    static int num, dup, den;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
         dup=num;
        isPrime();

        if(den==num){
            System.out.println(dup+" it is prime");
        }
        else{
            System.out.println(dup+" it is not prime");
        }
    }
    public static void isPrime(){
        den = 2;
        while(den<num){
            if(num%den == 0){
                break;
            }
            den++;
        }
    }
}
