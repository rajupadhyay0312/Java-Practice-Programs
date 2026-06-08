package ControlFlowStmts.If_Statements.java;

import java.util.Scanner;

public class IF_Upper_Lower_Digit_Special {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        if(ch>=65 && ch<=90){
            System.out.println(ch+ " is a Uppercase");
        }
        if(ch>=97 && ch<=122){
            System.out.println(ch+ " is a Lowercase");
        }
        if(ch>=48 && ch<=57){
            System.out.println(ch+" is a digit");
        }
        if(!((ch>='A' && ch<='Z') || (ch>=97 && ch<=122) || (ch>=48 && ch<=57))){
            System.out.println(ch+" is a Special Character");
        }
    }
}
