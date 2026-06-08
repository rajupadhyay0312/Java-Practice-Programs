package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;
public class primeNum {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Num :");
        int num = sc.nextInt();

       if(num==1){
           System.out.println("Its is not a prime");
       }
       else{
           int den = 2;
           while(den<=num/2){
               if(num%den==0){
                   break;
               }
               den++;
           }
           if(den>num/2){
               System.out.println("It is prime");
           }
           else{
               System.out.println("It is not prime");
           }
       }
    }

}
