package ControlFlowStmts.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class NeonNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        int dup = num;
        System.out.println("Num is : "+num);
        int square = num*num;
        System.out.println("Square is : "+square);
        int last = 0;
        int sum = 0;

        while(square>0){
            last = square%10;
            sum += last;
            square/=10;
        }
        System.out.println("Square of Sum is : " +sum);

        if(sum==num){
            System.out.println(dup+" is a NEON Number");
        }
        else{
            System.out.println(dup+" is not a NEON Num");
        }
    }
}
