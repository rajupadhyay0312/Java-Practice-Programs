package ControlFlowStmts.If_Else_if_Statements.java;

import java.util.Scanner;

public class If_Else_If_CurrencyConvertor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(; ;){
            System.out.println("\n WELCOME \n");
            System.out.printf
                    ("%-5s %-10s %-10s%n", "SrNo", "Currency", "Rate");
            System.out.printf
                    ("%-5d %-10s %-10f%n", 1, "USD", 88.0956);
            System.out.printf
                    ("%-5d %-10s %-10f%n", 2, "GBP", 118.298);
            System.out.printf
                    ("%-5d %-10s %-10f%n", 3, "KWD", 288.107);
            System.out.printf
                    ("%-5d %-10s %-10f%n", 4, "PKR", 0.311783);
            System.out.printf
                    ("%-5d %-10s %-10f%n", 5, "AFN", 1.2882098);
            System.out.printf
                    ("%-5d %-10s %-10f%n", 6, "AMD", 0.23126976);
            System.out.printf
                    ("%-5d %-10s %-10f%n", 7, "AUD", 57.457828);
            System.out.printf
                    ("%-5d %-10s %-10f%n", 8, "AZN", 51.855292);
            System.out.printf
                    ("%-5d %-10s %-10f%n", 9, "ADA", 73.674829);
            System.out.printf
                    ("%-5d %-10s %-10f%n", 10, "GMD", 1.2244016);


            System.out.print("\n Enter the amount(INR) : ");
            double inr = sc.nextDouble();
            System.out.print("Enter a Currency : ");
            int opt = sc.nextInt();
            double conv = 0;
            String curr = "?";

            if(opt == 1){
                conv = inr/ 88.0956;
                curr = "USD";
            }
            else if(opt == 2){
                conv = inr/ 118.298;
                curr = "GBP";
            }
            else if(opt == 3){
                conv = inr/ 288.107;
                curr = "KWD";
            }
            else if(opt == 4){
                conv = inr/ 0.311783;
                curr = "PKR";
            }
            else if(opt == 5){
                conv = inr/ 1.2882098;
                curr = "AFN";
            }
            else if(opt == 6){
                conv = inr/ 0.23126976;
                curr = "AMD";
            }
            else if(opt == 7){
                conv = inr/ 57.457828;
                curr = "AUD";
            }
            else if(opt == 8){
                conv = inr/ 51.855292;
                curr = "AZN";
            }
            else if(opt == 9){
                conv = inr/ 73.674829;
                curr = "ADA";
            }
            else if(opt == 10){
                conv = inr/ 1.2244016;
                curr = "GMD";
            }
            else{
                System.out.println("INVALID Currency");
                continue;
            }
            System.out.printf
                    ("%n%.2f INR == %.2f %s%n",inr, conv, curr);
        }
    }
}


