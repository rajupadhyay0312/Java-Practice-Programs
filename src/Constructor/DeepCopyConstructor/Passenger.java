package Constructor.DeepCopyConstructor;
public class Passenger {
   String name;
   String email;
   int age;
   long contact;
   long aadhaarNum;

   Address address;

   public Passenger(String name, String email,int age, long contact, long aadhaarNum, Address address){
       super();
       this.name= name;
       this.email=email;
       this.age=age;
       this.contact = contact;
       this.aadhaarNum=aadhaarNum;
       this.address = address;
   }

    public Passenger(Passenger oldPassenger) {
        super();
        this.name= oldPassenger.name;
        this.email=oldPassenger.email;
        this.age=oldPassenger.age;
        this.contact = oldPassenger.contact;
        this.aadhaarNum=oldPassenger.aadhaarNum;
        this.address = new Address(oldPassenger.address);
    }

    public void displayPassenger(){
       System.out.println("\n****** PASSENGER INFO ****** ");
       System.out.println("Name : "+name);
       System.out.println("Email : "+email);
       System.out.println("Age : "+age);
       System.out.println("Contact : "+contact);
       System.out.println("Aadhaar Number : "+aadhaarNum);
       address.displayAddress();
   }

}
