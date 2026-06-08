package OOPS.Interface;

class InsufficientFundsException extends RuntimeException{
    InsufficientFundsException(String desc){
        super(desc);
    }
}
interface Transaction{
    default public void creditCard(double amount){
        checkBalance(amount);
        System.out.println("Transaction completed successfully for "+amount+" rs from credit Card");
    }
    default public void debtCard(double amount){}
    private void checkBalance(double amount){
        if(!(amount<=UserAccount.balance)){
            throw new InsufficientFundsException("Account funds are insufficient");
        }
    }
}
class UserAccount{
    String name;
    static double balance;
    int pin;

    public UserAccount(String name,double balance,int pin) {
        this.name = name;
        this.balance=balance;
        this.pin=pin;
    }
}
class Payment extends UserAccount implements Transaction{
    public Payment(String name, double balance, int pin) {
        super(name, balance, pin);
    }
}
public class Java9_private_Method {
    public static void main(String[] args) {
        Payment obj = new Payment("Ramesh",20000,123);
        obj.creditCard(2100);
    }
}
