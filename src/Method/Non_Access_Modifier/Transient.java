package Method.Non_Access_Modifier;

import java.io.*;
class BankDetails implements Serializable {
    String name;
    String address;
    transient String pin;
    transient Long adharNumber;
    transient String panNumber;
    Long accountNumber;

    //constructor
    BankDetails(String name, String address, String pin, Long adharNumber, String panNumber, Long accountNumber)
    {
        this.name = name;
        this.address = address;
        this.pin = pin;
        this.adharNumber = adharNumber;
        this.panNumber = panNumber;
        this.accountNumber = accountNumber;
    }
        public void displayBankDetails() {
            System.out.println("Bank Details");
            System.out.println("Name : " + name);
            System.out.println("Address : " + address);
            System.out.println("Pin : " + pin);
            System.out.println("AdharNumber : " + adharNumber);
            System.out.println("pan number : "+panNumber);
            System.out.println("Account Number : " + accountNumber);
        }

    }

public class Transient {
    public static void main(String[] args) {
        BankDetails bankObject = new BankDetails("Ramesh Kumar", "Pune", "ramesh@123",
                987654321012L, "ABCDE1234A", 987654321234L);
        bankObject.displayBankDetails();

        //Serialization Process

        try {
            FileOutputStream fos = new FileOutputStream("bankDetails.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bankObject);
            System.out.println(bankObject);
            System.out.println("SERIALIZATION PROCESS COMPLETE");
        } catch (Exception e) {
            System.out.println("Something went wrong in ser process");
        }

        //de -serialization process

        try{
            FileInputStream fis = new FileInputStream("bankDetails.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            BankDetails deserBankObject = (BankDetails)ois.readObject();
            System.out.println("de-serialization process complete");
            System.out.println();
            deserBankObject.displayBankDetails();

        }
        catch(Exception e){
            System.out.println("Something went wrong in deserialization process");
        }
    }
}
