package ControlFlowStmts.If_Statements.java;

import java.util.Scanner;

public class IF_LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = sc.nextInt();

        if((year % 100!=0 || year%400 ==0) && year%4 ==0){
            System.out.println(year+ " is a leap Year");
        }
        if(!((year % 100!=0 || year%400 ==0) && year%4 ==0)){
            System.out.println(year+ " is Not a Leap Year");
        }
    }
}
