package ControlFlowStmts.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class HarshadNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int dup = num;
        int sum = 0;
        int last = 0;

        while(num>0){
            last =  num%10;
            sum += last;
            num/=10;
        }
        System.out.println("Sum is : " +sum);

        if(dup%sum == 0){
            System.out.println(dup+" is a Harshad Number");
        }
        else{
            System.out.println(dup+" Not  a Harshad Number");
        }
    }


}
