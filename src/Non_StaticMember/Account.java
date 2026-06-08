// BANK APPLICATION
package Non_StaticMember;

import java.util.ArrayList;
import java.util.Scanner;
public class Account {
    static long accountNumber1;
    String accountHolderName;
    String address;
    long contact;
    final static String BANK_NAME;
    final static String IFSC_CODE;
    final long ACCOUNT_NUMBER;

    static{
        BANK_NAME = "STATE BANK OF INDIA";
        accountNumber1= 123456789;
        IFSC_CODE = "SBIN000001";
    }
    {
        ACCOUNT_NUMBER = accountNumber1++;
    }
    Account(String accountHolderName, String address, long contact){
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.contact = contact;
    }
    public void displayAccountDetails(){
        System.out.println("\n ACCOUNT DETAILS ");
        System.out.println("Account Holder Name : "+accountHolderName);
        System.out.println("Address : "+address);
        System.out.println("Contact : "+contact);
        System.out.println("Bank Name : "+BANK_NAME);
        System.out.println("IFSC+CODE : "+IFSC_CODE);
        System.out.println("ACCOUNT_NUMBER : "+ACCOUNT_NUMBER +"\n");

    }
}
class Bank{
    static ArrayList<Account> accountHolderList = new ArrayList<Account>(); // initialized empty i.e; size==0
     Scanner sc = new Scanner(System.in);
     public void features(){

         for(; ;){
             System.out.println(" *** WELCOME TO SBI *** ");
             System.out.println("\n FEATURES ");
             System.out.println("1. ADD ACCOUNT ");
             System.out.println("2. VIEW ALL ACCOUNT");
             System.out.println("3. REMOVE ACCOUNT");
             System.out.println("4. EXIT \n ");

             System.out.print(" Enter your option : ");
             switch(sc.nextInt()){
                 case 1-> addAccount();
                 case 2-> viewAccountList();
                 case 3-> removeAccount();
                 case 4-> exit();
                 default->System.out.println("INVALID INPUT ");
             }
         }
     }
     public void addAccount(){
         System.out.println("\n NEW ACCOUNT CREATION");
         System.out.print("Name: ");
         String accountHolderName = new Scanner(System.in).nextLine();
         System.out.print("Address: ");
         String address = new Scanner(System.in).nextLine();
         System.out.print("Contact: ");
         long contact = new Scanner(System.in).nextLong();

         Account account = new Account(accountHolderName, address, contact);
                 accountHolderList.add(account);
     }
     public void viewAccountList(){
         if(accountHolderList.size() == 0){
             System.out.println("\n NO ACCOUNT DATA FOUND \n");
             return;
         }
         System.out.println("\n *** ALL ACCOUNT HOLDER LIST *** ");
         for(Account object : accountHolderList){
             object.displayAccountDetails();
             System.out.println("---------------------------------");
         }
     }
     public void removeAccount(){
         if(accountHolderList.size()==0){
             System.out.println("\n NO ACCOUNT DATA FOUND \n");
             return;
         }
         System.out.print("Enter your ACCOUNT_NUMBER: ");
         final long USER_ACCOUNT_NUMBER = new Scanner(System.in).nextLong();

         for(int i = 0; i<=accountHolderList.size()-1; i++){
             Account object = accountHolderList.get(i);
             if(object.ACCOUNT_NUMBER == USER_ACCOUNT_NUMBER){
                 accountHolderList.remove(i);
                 System.out.println("\n ACCOUNT REMOVED SUCCESSFULLY \n ");
                 return;
             }
         }
         System.out.println("\n ACCOUNT NOT FOUND \n");
     }
     public void exit(){
         System.out.println(" *** THANKS YOU *** \n");
     }
}
class DriverExample23{
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.features();
    }
}
