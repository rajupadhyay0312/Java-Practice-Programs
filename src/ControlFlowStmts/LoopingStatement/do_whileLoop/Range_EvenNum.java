package ControlFlowStmts.LoopingStatement.do_whileLoop;

import java.util.Scanner;
public class Range_EvenNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start Num : ");//1
        int start = sc.nextInt();
        System.out.print("Enter a End Num : ");//10
        int end = sc.nextInt();

        do{
            if(start%2==0){
                System.out.println("Even number is :"+start);
            }
            start++;
        }while(start<=end);
    }
}
