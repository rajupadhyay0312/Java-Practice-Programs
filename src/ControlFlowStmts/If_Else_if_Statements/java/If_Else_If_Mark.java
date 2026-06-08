package ControlFlowStmts.If_Else_if_Statements.java;

import java.util.Scanner;

public class If_Else_If_Mark {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Marks : ");
        double marks = sc.nextDouble();

        if(marks<0 || marks>=500){
            System.out.println("\n INVALID MARKS \n");
        }
        else{
            //valid marks
            double per = marks/500*100;
            String performance = " ";
            char grade = ' ';
            if(per >= 90){
                performance = "Outstanding";
                grade = 'O';
            }
            else if(per >= 75){
                performance = "FirstClass Distinction";
                grade = 'A';
            }
            else if(per >= 60){
                performance = "FirstClass";
                grade = 'B';
            }
            else if(per >= 50){
                performance = "SecondClass";
                grade = 'C';
            }
            else if(per >= 35){
                performance = "PASS";
                grade = 'P';
            }
            else{
                performance = "Fail";
                grade = 'F';
            }
            System.out.printf("%nMarks :%.2f%nPercentage :%.2f%%", marks, per);
            System.out.printf("%nPerformance :%s%nGrade :%c%n",performance,grade);
        }
    }
}
