package ControlFlowStmts.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long num = sc.nextInt();
        long fact = 1;
        long i = 1;
        while( i<=num){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial : " +fact);
    }
}
