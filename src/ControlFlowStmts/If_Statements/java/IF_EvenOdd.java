package ControlFlowStmts.If_Statements.java;

import java.util.Scanner;

public class IF_EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("is Even Number");
        }
        if(num%2==1){
            System.out.println("is Odd Number");
        }
    }
}
