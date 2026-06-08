package Exception_Handling;

class InvalidPinException extends Exception{
    InvalidPinException(String desc)
    {
        super(desc);
    }
}
public class InvalidPinExceptionExample1
{
    static int pin = 1234;
    static double balance = 20000;

    public static void main(String[] args) {
        System.out.println("Exe start");
        System.out.print("Enter a PIN : ");
        int pin = new java.util.Scanner(System.in).nextInt();
        try{
            checkBalance(pin);
        }catch(InvalidPinException e){
            System.out.println("InvalidPinException handled");
        }
        System.out.println("exe ends");
    }
    public static void checkBalance(int userPin) throws InvalidPinException
    {
        if(userPin == pin){
            System.out.println("Your account balance is : "+balance);
        }else{
            throw new InvalidPinException("Enter pin is Invalid");
        }
    }
}
