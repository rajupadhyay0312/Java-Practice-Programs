package ControlFlowStmts.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class BasePower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Base : ");
        int base = sc.nextInt();

        System.out.print("Enter a Power : ");
        int pow = sc.nextInt();

        int i = 1;
        int result = 1;
        while(i<=pow){
            result = result*base;
            i++;
        }
        System.out.println("Result : " +result);
    }
}
