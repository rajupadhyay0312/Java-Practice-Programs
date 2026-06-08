package OOPS.Polymorphism.Variable_Shadowing;

//Instance variable shadow by method parameter

class Bank{
    private String pin;
    private double balance;

    public Bank(String pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String getPin(){
        return pin;
    }
}
public class Scenario3 {
    public static void main(String[] args) {
        Bank bank = new Bank("123",10000);
        System.out.print("Enter pin :");
        String userPin = new java.util.Scanner(System.in).next();
        if(userPin.equals(bank.getPin())){
            System.out.println("balance");
        }
    }
}
