package ControlFlowStmts.LoopingStatement.ForLoop;

import java.util.Scanner;

public class For_HarshadNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num : ");
        int num = sc.nextInt();
        int dup = num;
        int sum = 0;
        int last = 0;

        for(;num>0; num/=10){
            last = num%10;
            sum += last;
        }
        System.out.println("Sum is : "+sum);

        if(dup%sum == 0){
            System.out.println(dup+" is a Harshad Num ");
        }
        else{
            System.out.println(dup+" Not a Harshad Num ");
        }
    }

}
