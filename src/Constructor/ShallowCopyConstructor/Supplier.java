package Constructor.ShallowCopyConstructor;

public class Supplier {
    String name;
    String email;
    long contact;
    Address address;

    public Supplier(String name, String email, long contact, Address address){
        super();
        this.name=name;
        this.email=email;
        this.contact=contact;
        this.address=address;
    }
    public void displaySupplier(){
        System.out.println("\n ****** SUPPLIER INFO ******* ");
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Contact : "+contact);
        address.displayAddress();
    }
}
