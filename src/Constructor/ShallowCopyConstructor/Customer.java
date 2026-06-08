package Constructor.ShallowCopyConstructor;

public class Customer {
    String name;
    String emailId;
    long contact;
    Address address;

    public Customer(String name, String emailId,  long contact, Address address){
        super();
        this.name=name;
        this.emailId=emailId;
        this.contact = contact;
        this.address=address;
    }
    public void displayCustomer(){
        System.out.println("\n ***** CUSTOMER INFO ****** ");
        System.out.println("Name : "+name);
        System.out.println("EmailId : "+emailId);
        System.out.println("Contact : "+contact);
        address.displayAddress();
    }
}
