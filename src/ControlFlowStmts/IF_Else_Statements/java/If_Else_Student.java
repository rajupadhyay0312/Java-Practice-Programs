package ControlFlowStmts.IF_Else_Statements.java;

import java.util.Scanner;

public class If_Else_Student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Percentage : ");
        float per = sc.nextFloat();

        if(per >= 60){
            System.out.println("Eligible for interview");
        }
        else{
            System.out.println("Not Eligible for Interview");
        }
    }
}
