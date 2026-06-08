package ControlFlowStmts.LoopingStatement.do_whileLoop;

import java.util.Scanner;
public class Range_OddNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start Num :");//3
        int start = sc.nextInt();
        System.out.print("Enter a End Num :");//30
        int end = sc.nextInt();

        do{
            if(start%2==1){
                System.out.println("Odd number is :"+start);
            }
            start++;
        }while(start<=end);
    }
}
