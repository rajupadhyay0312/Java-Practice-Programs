package ControlFlowStmts.IF_Else_Statements.java;

import java.util.Scanner;

public class If_Else_Salary {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter a Salary :");
        double salary = sc.nextInt();
        double dup = salary;
        System.out.print("Enter a Score : ");
        int score = sc.nextInt();

        if(score < 0 || score > 100){
            System.out.println("Invalid Score");
            return; //terminates the execution of method
        }
        int per = 0;
        if(score>=90){
            per = 3;
            salary = (salary+salary*per/100);
        }
        else{
            per = 1;
            salary = (salary+salary*per/100);
        }
            System.out.printf("prev salary :%.2f, Revised salary : %.2f",  dup, salary);
    }

}



