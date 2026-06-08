package ControlFlowStmts.IF_Else_Statements.java;

import java.util.Scanner;

public class If_Else_EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num  = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Is Even Number");
        }
        else{
            System.out.println("Is not a Even Number");
        }
    }
}
