package ControlFlowStmts.LoopingStatement.do_whileLoop;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        int count = 0;
        do{
            count++;
            num/=10;
        }while(num>0);
        System.out.println("Count : "+count);
    }

}
