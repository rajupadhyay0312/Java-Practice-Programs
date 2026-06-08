package ControlFlowStmts.If_Else_if_Statements.java;

import java.util.Scanner;

public class If_Else_If_VowelConsonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        if(ch=='a' || ch == 'A'){
            System.out.println(ch+ " is a vowel");
        }
        else if(ch=='e' || ch == 'E'){
            System.out.println(ch+ " is a vowel");
        }
        else if(ch=='i' || ch == 'I'){
            System.out.println(ch + " is a vowel");
        }
        else if(ch=='o' || ch == 'O'){
            System.out.println(ch+" is a vowel");
        }
        else if(ch=='u' || ch == 'U'){
            System.out.println(ch+" is a vowel");
        }
        else{
            System.out.println(ch+" is a consonant");
        }
    }
}
