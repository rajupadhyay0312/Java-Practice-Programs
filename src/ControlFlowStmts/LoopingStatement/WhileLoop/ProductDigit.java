package ControlFlowStmts.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class ProductDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int prod = 1;
        int last = 0;
       while(num>0){
            last = num%10;
            prod *= last;
            num/=10;
        }
        System.out.println("Product  : " + prod);
    }
}
