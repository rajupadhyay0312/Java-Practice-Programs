package ControlFlowStmts.LoopingStatement.ForLoop;

import java.util.Scanner;
public class For_ProductDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int prod = 1;
        int last = 0;
        for(; num>0; num/=10){
            last = num%10;
            prod *= last;
        }
        System.out.println("Product  : " + prod);
    }
}
