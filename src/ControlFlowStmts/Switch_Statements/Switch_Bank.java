package ControlFlowStmts.Switch_Statements;

import java.util.ArrayList;
import java.util.Scanner;

public class Switch_Bank {
    static String name;
    static String address;
    static String phone;
    static String pin;
    static double balance;

    static ArrayList<String> transaction = new ArrayList<String>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(; ;){
            System.out.println("\n **** WELCOME ****");
            System.out.println(" LAXMI CHIT FUND \n");
            System.out.println("1.NEW USER\n2.EXISTING USERS \n");
            System.out.print("Enter your option : ");
            int option = sc.nextInt();

            switch(option){
                case 1 :{
                    System.out.println("\n NEW ACCOUNT INFO \n");
                    System.out.print("Username : ");
                    name = sc.next();
                    System.out.print("Address : ");
                    address = sc.next();
                    System.out.print("Phone : ");
                    phone = sc.next();
                    System.out.print("Pin : ");
                    pin = sc.next();
                    System.out.print("Amount : ");
                    balance = sc.nextDouble();
                    transaction.add("Deposit :"+balance+"rs");
                    System.out.print("\n ACCOUNT CREATED SUCCESSFULLY \n");
                    break;
                }
                case 2 : {
                    if(name == null){
                        System.out.println("\n CREATE YOUR ACCOUNT FIRST\n");
                        break;
                    }
                    System.out.println("\n  LOGIN    \n");
                    System.out.println("Username/Contact : ");
                    String cred1 = sc.next();
                    System.out.println("Password : ");
                    String cred2 = sc.next();

                    if((cred1.equals(name)||cred2.equals(phone))&&cred2.equals(pin))
                    {
                        //feature
                        for(; ;){
                            System.out.println("\n ** FEATURE ** \n");
                            System.out.println("1.DEPOSIT AMOUNT");
                            System.out.println("2.WITHDRAW AMOUNT");
                            System.out.println("3.CHECK BALANCE");
                            System.out.println("4.TRANSACTIONS");
                            System.out.println("5.LOGOUT \n");
                            System.out.print("Enter your option : ");
                            int opt = sc.nextInt();

                            switch(opt)
                            {
                                case 1:{
                                    System.out.println("\n DEPOSIT FEATURE \n");
                                    System.out.print("Enter your amount : ");
                                    double depositAmount = sc.nextDouble();
                                    balance += depositAmount;
                                    transaction.add("Deposit : "+depositAmount+"rs");
                                    System.out.println("\n AMOUNT DEPOSITED SUCCESSFULLY \n");
                                    break;
                                }
                                case 2:{
                                    System.out.println("\n WITHDRAW FEATURE \n");
                                    System.out.print("Enter your amount : ");
                                    double withdrawAmt = sc.nextDouble();
                                    System.out.println("Enter a your pin : ");
                                    String pin1 = sc.next();

                                    if(pin1.equals(pin))
                                    {
                                       if(withdrawAmt<=balance)
                                       {
                                           balance -= withdrawAmt;
                                           transaction.add("Withdraw : "+withdrawAmt+"rs");
                                           System.out.println("\n AMOUNT DEBITED SUCCESSFULLY \n");
                                           System.out.print("DO U WANT TO VIEW your BALANCE(Y/N) : " );
                                           char resp = sc.next().charAt(0);
                                           if(resp=='Y')
                                           {
                                              System.out.println("YOUR AMOUNT balance is :" + balance+"rs.");
                                           }
                                       }
                                       else{
                                           System.out.println("\n INSUFFICIENT FUND \n");
                                       }
                                    }
                                    else{
                                        System.out.println("\n INVALID PIN \n");
                                    }
                                    break;
                                }
                                case 3 :{
                                    System.out.println("\n CHECK BALANCE FEATURE \n");
                                    System.out.print("Enter your PIN : ");
                                    String pin1 = sc.next();

                                    if(pin1.equals(pin)){
                                        System.out.println("YOUR ACCOUNT BALANCE IS : " +balance+"rs.");
                                    }
                                    else{
                                        System.out.println("\n INVALID PIN\n");
                                    }
                                    break;
                                }
                                case 4:{
                                    System.out.println("\n TRANSACTION\n");
                                    for(String ele : transaction){
                                        System.out.println(ele);
                                    }
                                    break;
                                }
                                case 5:{
                                    System.out.println("THANK U FOR USING LAXMI CHIT FUND");
                                    System.out.println("YOUR MONEY IS SAFE WITH US : ");
                                    System.exit(0);//terminates the JVM
                                }
                                default :{
                                    System.out.println("\n INVALID OPTION \n");
                                    break;
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("\n INVALID CRED \n");
                    }
                    break;
                }
                default:{
                    System.out.println("\n INVALID OPTION \n");
                }
            }

        }
    }

}
