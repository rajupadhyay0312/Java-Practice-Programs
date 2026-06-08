package ControlFlowStmts.LoopingStatement.Label;

import java.util.Scanner;

public class PasswordProgram {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int StorePin = 143;
        int duration = 2000;

        outerLoop:
        for(; ;){
            int attempts = 3;
            do{
                System.out.print("Enter your Pin : ");
                int userPin = sc.nextInt();

                if(StorePin == userPin){
                    System.out.println("PHONE UNLOCKED\n");
                    break outerLoop;
                }
                else{
                    System.out.println("INVALID PIN");
                    System.out.println("Attempt left : "+(attempts-1));
                }
                attempts--;

            }while(attempts>=1);

            System.out.println("\n phone disabled for "+ (duration/1000)+"second\n");
            Thread.sleep(duration);
            duration*=2;
        }
    }
}
