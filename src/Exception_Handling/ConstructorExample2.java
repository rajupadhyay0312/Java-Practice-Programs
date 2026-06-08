package Exception_Handling;

class InvalidAmountDepositException extends Exception{
    InvalidAmountDepositException(String desc){
        super(desc);
    }
}
class Bank{

    String name;
    double balance;
    int pin;

    public Bank(String name, double balance, int pin) {
        this.name = name;
        try{
            this.balance  = depositAmountCheck(balance);
        }
        catch(InvalidAmountDepositException e){
            System.out.println(e.getMessage());
        }
        this.pin = pin;
    }
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", pin=" + pin +
                '}';
    }
    public double depositAmountCheck(double balance) throws  InvalidAmountDepositException{
        if(balance<500)
            throw new InvalidAmountDepositException("Enter amount should be min 500 ");
        return balance;
    }
}
public class ConstructorExample2 {
    public static void main(String[] args) {
        Bank obj = new Bank("Ramesh Kumar",200,1234);
        System.out.println(obj);
    }
}
