package ControlFlowStmts.LoopingStatement.ForLoop;

import java.util.Scanner;

public class For_Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long num = sc.nextInt();
        long fact = 1;
        for(long i = 1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial : " +fact);
    }
}
