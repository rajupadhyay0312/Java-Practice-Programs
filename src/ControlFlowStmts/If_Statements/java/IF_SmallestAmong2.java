package ControlFlowStmts.If_Statements.java;

import java.util.Scanner;

public class IF_SmallestAmong2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a Num2: ");
        int num2 = sc.nextInt();

        if(num1<num2){
            System.out.println(num1+" is a Smallest");
        }
        if(num1>num2){
            System.out.println(num2+" is a Smallest");
        }
    }
}
