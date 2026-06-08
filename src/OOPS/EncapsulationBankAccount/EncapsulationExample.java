package OOPS.EncapsulationBankAccount;

import java.util.Scanner;
class User {
    private String name;
    private long contact;
    private String email;

    User(String name, long contact, String email) {
        super();
        this.name = name;
        this.contact = contact;
        this.email = email;
    }

    public void displayUser() {
        System.out.println("\n ******** USER INFO ****** ");
        System.out.println("Name : " + name);
        System.out.println("Contact : " + contact);
        System.out.println("Email : " + email);
    }
}

class BankAccount {
    final static String BANK_NAME;
    final static String IFSC_CODE;
    private final long DEBIT_CARD;
    private double balance;
    private int upiPin;

    static {
        BANK_NAME = "SBI";
        IFSC_CODE = "SBIN000004567";
    }

    BankAccount(long DEBIT_CARD, double balance, int upiPin) {
        super();
        this.DEBIT_CARD = DEBIT_CARD;
        this.balance = balance;
        this.upiPin = upiPin;

    }
    public int getUpiPin(){
        return this.upiPin;
    }
    public double getBalance(){
        return this.balance;
    }
}
class PhonePay{
    User user = new User("Ramesh Kumar",9876543210L,"ramesh@gmail.com");
    BankAccount account = new BankAccount(1234_3456_5678_5432L,50000,2345);

    {
        System.out.print("Enter Your Device Pin :"); // 1234
        int devicePinUser = new Scanner(System.in).nextInt();
        //int devicePin = Integer.parseInt(System.getenv("devicePin"));
        int devicePin = 1234;

        if(devicePinUser!=devicePin){
            System.out.println("\n INVALID PIN");
            System.exit(0);
        }
        launchApplication();
    }
    public void launchApplication() {
        for (; ; ) {
            System.out.println("\n ***** HOME PAGE ***** ");
            System.out.println("1.TRANSFER FUNDS");
            System.out.println("2.TRANSACTION");
            System.out.println("3.VIEW BALANCE");
            System.out.print("Enter Your option :");
            int opt = new Scanner(System.in).nextInt();
            switch (opt) {
                case 1 -> System.out.println("\n********** TRANSFER FUNDS ********");
                case 2 -> System.out.println("\n ********** TRANSACTION ********");
                case 3 -> ViewBalance();
                default -> System.out.println("\n ********** TRANSFER FUNDS ********");
            }
        }
    }
    public void ViewBalance(){
        System.out.println(" **** VIEW BALANCE *****");
        System.out.print("Enter a PIN : ");
        int userPin = new Scanner(System.in).nextInt();
        if(userPin!=account.getUpiPin()){
            System.out.println("\n INVALID UPI_PIN");
        }else{
            System.out.println("\n YOUR ACCOUNT BALANCE IS : "+account.getBalance()+"\n");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
       PhonePay obj = new PhonePay();
    }
}
