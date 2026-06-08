package ControlFlowStmts.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class SpyNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int dup = num;
        int sum = 0;
        int prod = 1;
        int last = 0;
        while(num>0){
            last = num%10;
            sum += last;
            prod *= last;
            num/=10;
        }
        System.out.println("Sum : "+sum);
        System.out.println("Product : "+prod);

        if(sum == prod){
            System.out.println(dup+" It is a SpyNum");
        }
        else{
            System.out.println(dup+" Not a SpyNum");
        }
    }
}
