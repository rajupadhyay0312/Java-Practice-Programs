package ControlFlowStmts.If_Statements.java;

import java.util.Scanner;

public class IF_Vowel_Consonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        String str = sc.next();
        char ch = str.toUpperCase().charAt(0);

        if(ch =='A' || ch =='E' || ch =='I' || ch == 'O' || ch == 'U'){
            System.out.println(ch+ " is a Vowel");
        }
        if(!(ch =='A' || ch =='E' || ch =='I' || ch == 'O' || ch == 'U')){
            System.out.println(ch +" is a Consonant");
        }
    }
}
