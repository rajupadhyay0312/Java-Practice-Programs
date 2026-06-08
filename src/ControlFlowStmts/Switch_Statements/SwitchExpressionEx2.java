package ControlFlowStmts.Switch_Statements;

import java.util.Scanner;

enum Months {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
}
public class SwitchExpressionEx2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Month : ");
        String monthStr = sc.next().toUpperCase();
        Months month = Months.valueOf(monthStr);
        String season = switch(month){
            case FEB, MAR, APR, MAY ->"It's Summer";
            case OCT,NOV,DEC, JAN -> "It's Winter";
            case JUN, JUL,AUG,SEP ->"It's Monsoon";
        };
        System.out.println(monthStr+" : "+season);
    }

}
