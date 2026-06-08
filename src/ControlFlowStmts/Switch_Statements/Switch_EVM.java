package ControlFlowStmts.Switch_Statements;

import java.util.Scanner;

public class Switch_EVM {

    static int bjp, con, aap, mns, nota;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Population : ");
        int pop = sc.nextInt();

        for(int i=1; i<=pop; i++){
            System.out.println("\n **** WELCOME **** \n");
            System.out.println(" 1.BJP\n 2.CON\n 3.AAP\n 4.MNS\n 5.NOTA\n");
            System.out.print("Enter a option : ");
            String vote = sc.next().toUpperCase();

            switch(vote)
            {
                case "BJP":{
                   bjp++;
                   System.out.println("U HAVE VOTED FOR BJP");
                    System.out.println("ACHE DIN AYENGE");
                    break;
                }
                case "CON":{
                    con++;
                    System.out.println("U HAVE VOTED FOR CON");
                    System.out.println("BHARAT JODO");
                    break;
                }
                case "AAP":{
                    aap++;
                    System.out.println("U HAVE VOTED FOR AAP");
                    System.out.println("Your One vote can make me free");
                    break;
                }
                case "MNS":{
                    mns++;
                    System.out.println("U HAVE VOTED FOR MNS");
                    System.out.println("JAI MAHARASHTRA");
                    break;
                }
                case "NOTA":{
                    nota++;
                    System.out.println("U HAVE VOTED FOR NOTA");
                    System.out.println("OHHHH U R EDUCATED");
                    break;
                }
                default :{
                    System.out.println("INVALID RESPONSE ");
                    i--;
                    break;
                }
            }
        }
        //winner
        if(bjp>=con && bjp>=mns && bjp>=aap && bjp>=nota){
            System.out.println("BJP HAS WON THE ELECTION BY " +bjp+" votes");
        }
        else if(con>=bjp && con>=mns && con>=aap && con>=nota){
            System.out.println("CON HAS WON THE ELECTION BY " +con+" votes");
        }
        else if(aap>=bjp && aap>=con && aap>=mns && aap>=nota){
            System.out.println("AAP HAS WON THE ELECTION BY " +mns+" votes");
        }
        else if(mns>=bjp && mns>=con && mns>=aap && mns>=nota){
            System.out.println("MNS HAS WON THE ELECTION BY " +aap+" votes");
        }
        else {
            System.out.println("NOTA");
        }
    }
}
