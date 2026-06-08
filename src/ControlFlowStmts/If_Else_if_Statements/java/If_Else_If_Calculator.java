package ControlFlowStmts.If_Else_if_Statements.java;

import java.util.Scanner;

public class If_Else_If_Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num1 : ");
        double num1 = sc.nextDouble();

        System.out.print("Enter a num2 : ");
        double num2 = sc.nextDouble();

        System.out.print("Enter a Operator : ");
        char operator = sc.next().charAt(0);

        double result = 0;
        boolean assump = true;

        if(operator == '+'){
            result = num1+num2;
        }
        else if(operator == '-'){
            result = num1-num2;
        }
        else if(operator == '*'){
            result = num1/num2;
        }
        else if(operator == '/'){
            result = num1/num2;
        }
        else if(operator == '%'){
            result = num1%num2;
        }
        else{
            assump = false;
            System.out.println("\n INVALID Operator \n");
        }
        if(assump){
            System.out.printf("%n%.2f %c %.2f = %.2f%n",num1,operator,num2,result);
        }
    }
}
