package ControlFlowStmts.IF_Else_Statements.java;

import java.util.Scanner;

public class If_Else_positive_Negative {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        if(num>0){
            System.out.print(num+ " is a positive number");
        }
        else{
            System.out.println(num+" is a negative Number");
        }
    }
}
