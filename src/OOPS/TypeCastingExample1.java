package OOPS;

class Bank{
    String name;
    final String IFSC_CODE;
    final long ACCOUNT_NUMBER;
    long contact;
    final long DEBIT_CARD;
    final int CVV;

    public Bank(String name, String IFSC_CODE,  long ACCOUNT_NUMBER, long DEBIT_CARD, int CVV, long contact) {
        this.name = name;
        this.IFSC_CODE = IFSC_CODE;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.DEBIT_CARD = DEBIT_CARD;
        this.CVV = CVV;
        this.contact = contact;
    }
    public void displayBank() {
        System.out.println("Bank[" +
                "name=" + name  +
                ", IFSC_CODE=" + IFSC_CODE +
                ", ACCOUNT_Number=" + ACCOUNT_NUMBER +
                ", contact=" + contact +
                ", DEBIT_CARD=" + DEBIT_CARD +
                ", CVV=" + CVV +
                "]");
    }
}
class Payment{
    String name;
    String email;

    public void proceedPayment(Payment obj){
        if(obj instanceof PhonePay){
            PhonePay obj1 = (PhonePay)obj;
            obj1.displayPhonePay();
        }
        else if(obj instanceof GooglePay){
            GooglePay obj1 = (GooglePay)obj;
            obj1.displayGooglePay();
        }
    }
}
class PhonePay extends Payment{
    String name = "PhonePay";
    Bank bank = new Bank("SBI","SBIN0003456",987643626763L,1234_6789_5643_1234L,123,9876355522L);

    public void displayPhonePay(){
        System.out.println("App Name :"+name);
        bank.displayBank();
    }
}
class GooglePay extends Payment{
    String appName = "GooglePay";

    Bank bank = new Bank("HDFC","HDFC0003456",9876436636763L,1234_6789_5_1278_2334L,143,9878866522L);

    public void displayGooglePay(){
        System.out.println("App Name :"+appName);
        bank.displayBank();
    }
}
class Flipkart{
    String name;
    long contact;

    public Flipkart(String name, long contact) {
        this.name = name;
        this.contact = contact;
    }
    public void payment(){
        for(; ;){
            System.out.println("PAYMENT MODULE");
            System.out.println("1.PhonePay");
            System.out.println("2.GooglePay");
            System.out.println("3. COD");
            System.out.print("Enter your option : ");
            switch(new java.util.Scanner(System.in).nextInt())
            {
                case 1:{
                    PhonePay obj = new PhonePay();
                    obj.proceedPayment(obj);
                    break;
                }
                case 2:{
                    GooglePay obj = new GooglePay();
                    obj.proceedPayment(obj);
                    break;
                }
                case 3:{
                    System.out.println("\n KEEP YOUR CASH READY\n");
                    break;
                }
                default:{
                    System.out.println("\n Invalid option \n");
                }
            }
        }
    }
}
public class TypeCastingExample1 {
    public static void main(String[] args) {
        Flipkart app = new Flipkart("Ramesh",9835633727L);
        app.payment();
    }
}
