package ControlFlowStmts.LoopingStatement.ForLoop;

import java.util.Scanner;

public class For_BasePower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Base : ");
        int base = sc.nextInt();

        System.out.print("Enter a Power : ");
        int pow = sc.nextInt();

        int result = 1;
        for(int i = 1; i<=pow; i++){
            result = result*base;
        }
        System.out.println("Result : " +result);
    }

}
