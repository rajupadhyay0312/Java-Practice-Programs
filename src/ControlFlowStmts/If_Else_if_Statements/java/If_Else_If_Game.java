package ControlFlowStmts.If_Else_if_Statements.java;

import java.util.Scanner;

public class If_Else_If_Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //it's an infinite loop
        for(; ;){
            System.out.println("\n     WELCOME    \n");
            //user imp
            System.out.println("1. STONE \n2.PAPER \n3.SCISSOR\n");
            System.out.print("Enter your option : ");
            int userOption = sc.nextInt();

            //invalid option
            if(userOption<1 || userOption>3){
                System.out.println("\n INVALID OPTION \n");
                continue; //it will transfer the control to next iteration
            }
            //user input against the options
            String userResp = "";

            if(userOption == 1){
                userResp = "STONE";
            }
            else if(userOption==2){
                userResp = "PAPER";
            }
            else{
                userResp = "SCISSOR";
            }
            //BOT IMPL
            int botOption = 0;
            for(; ;){
                botOption = (int)(Math.random()*10);
                if(botOption>=1 && botOption<=3){
                    break;
                }
            }
            String botResp = "";

            if(botOption == 1){
                botResp = "STONE";
            }
            else if(botOption == 2){
                botResp = "PAPER";
            }
            else{
                botResp = "SCISSOR";
            }
            System.out.printf("%n%10s %-10s%n", "USER","BOT");
            System.out.printf("%10s %-10s%n%n", userResp,botResp);

            //Winner
            if(userResp.equals("STONE") && botResp.equals("SCISSOR")||
                    (userResp.equals("PAPER") && botResp.equals("STONE"))||
                    (userResp.equals("SCISSOR") && botResp.equals("PAPER"))){
                System.out.println("\n   ***** USER WINS **** \n");
            }
            else if(userResp.equals("STONE") && botResp.equals("PAPER")||
                    (userResp.equals("PAPER") && botResp.equals("SCISSOR"))
                            ||(userResp.equals("SCISSOR") && botResp.equals("STONE")))
            {
                System.out.println("\n **** BOT WINS ****\n");
            }
            else{
                System.out.println("************* DRAW *************");
            }
        }

    }
}

