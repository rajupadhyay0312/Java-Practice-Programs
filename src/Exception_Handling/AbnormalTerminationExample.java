package Exception_Handling;

// If an exception occurs before try block it cannot handle so program terminate abnormally
public class AbnormalTerminationExample {
    public static void main(String[] args) {
        System.out.println("exe start");

        System.out.println(10/0);
        try{
            System.out.println("try");
        }
        catch(ArithmeticException e){
            System.out.println("catch");
        }
        System.out.println("exe ends");
    }
}
