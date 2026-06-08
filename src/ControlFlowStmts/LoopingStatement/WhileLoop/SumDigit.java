package ControlFlowStmts.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num : ");
        int num = sc.nextInt();

        int sum = 0;
        int last = 0;

        while(num>0){
            last = num%10;
            sum += last;
            num/=10;
        }
        System.out.println("Sum is : " +sum);

    }
}
