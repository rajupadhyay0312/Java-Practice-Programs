package ControlFlowStmts.LoopingStatement.ForLoop;

import java.util.Scanner;

public class For_NeonNum {
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

        for(;square>0;square/=10){
            last = square%10;
            sum += last;
        }
        System.out.println("Square of Sum is : " +sum);

        if(sum==num){
            System.out.println(dup+" is a NEON Number");
        }
        else{
            System.out.println(dup+" is not NEON Num");
        }
    }
}
