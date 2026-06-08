package ControlFlowStmts.LoopingStatement.ForLoop;

import java.util.Scanner;

public class For_SpyNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int dup = num;
        int sum = 0;
        int prod = 1;
        int last = 0;
        for(;num>0;num/=10){
            last = num%10;
            sum += last;
            prod *= last;
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
