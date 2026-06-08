package ControlFlowStmts.LoopingStatement.ForLoop;

import java.util.Scanner;

public class For_SumDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        int last = 0;
        for(; num>0; num/=10){
            last = num%10;
            sum += last;
        }
        System.out.println("Sum : " + sum);
    }
}
