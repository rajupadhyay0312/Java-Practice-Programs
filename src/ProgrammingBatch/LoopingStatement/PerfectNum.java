package ProgrammingBatch.LoopingStatement;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num : ");
        int num =  sc.nextInt();
        int den = 1; //den=denominator... every number factor is starting with one
        int sum = 0;
        while(den<=num/2){
            if(num%den==0){

                sum+=den;
            }
            den++;
        }
        if(num==sum){
            System.out.println("It is a perfect");
        }
        else{
            System.out.println("It not a perfect");
        }
    }
}
