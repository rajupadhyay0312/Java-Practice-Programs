package Exception_Handling.CustomException;

import java.util.Scanner;

class InsufficientFundsException extends RuntimeException{
    InsufficientFundsException(String message){
        super(message);
    }
}
class Bank{
    String name;
    double balance;
    int pin;

    public Bank(String name, double balance, int pin) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }
}
public class Example1 {
    public static void main(String[] args) {
        Bank bank = new Bank("Ramesh Kumar",10000,123);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if(amount<= bank.balance){
            bank.balance -= amount;
            System.out.println("Amount debited Successfully");
        }else{
            try{
                throw new InsufficientFundsException("Account doesn't have enough funds");
            }
            catch (InsufficientFundsException e){
                System.out.println(e.getMessage());
            }
        }


    }
}
