package ControlFlowStmts.IF_Else_Statements.java;

import java.util.Scanner;

public class If_ElseExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a age:");
        int age = sc.nextInt();

        System.out.print("Enter a Property:");
        int property = sc.nextInt();

        System.out.print("Enter a Surname:");
        String surname = sc.next();

        if(age>=21 && (property>=10000000 || surname.equals("Ambani"))){
            System.out.println("Eligible for Marriage");
        }
        else{
            System.out.println("Not Eligible for Marriage");

        }


    }
}
