package Constructor.ShallowCopyConstructor;

public class Delivery {
    String name;
    long contact;
    String email;
    String pickup;
    String shipped;

    public Delivery(String name, long contact, String email, String pickup, String shipped)
    {
        super();
        this.name=name;
        this.contact=contact;
        this.email=email;
        this.pickup = pickup;
        this.shipped=shipped;
    }
    public void displayDelivery(){
        System.out.println("\n ****** DELIVERY INFO ****** ");
        System.out.println("Name : "+name);
        System.out.println("Contact : "+contact);
        System.out.println("Email : "+email);
        System.out.println("PickUp : "+pickup);
        System.out.println("Shipped : "+shipped);
    }
}
