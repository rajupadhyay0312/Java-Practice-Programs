package ControlFlowStmts.LoopingStatement.ForLoop;

import java.util.Scanner;

public class For_CountDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Num : "+num);
        int count = 0;
        for(; num>0; num/=10) {
            count++;
        }
        System.out.println("count is : " + count);
        System.out.println("After loop number : "+num);

    }
}
