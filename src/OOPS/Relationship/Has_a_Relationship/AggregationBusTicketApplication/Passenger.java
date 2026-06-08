package OOPS.Relationship.Has_a_Relationship.AggregationBusTicketApplication;

public class Passenger {
    private String name;
    private String password;
    private long contact;
    private String email;
    private String gender;
    private int age;
    private String seatNumber;
    private double price =1500;

    public Passenger(String name, String password, long contact, String email, String gender,
                     int age)
    {
        this.name = name;
        this.password = password;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.age = age;

    }

    public void getPassengerInfo() {
        System.out.println("\n *** PASSENGER DETAILS ***");
        System.out.println("Name :" + name);
        System.out.println("Password : " + password);
        System.out.println("Contact : " + contact);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
    }
    public long getContact(){
        return this.contact;
    }
    public String getPassword(){
        return this.password;
    }
    public void setSeatNumber(String seatNumber){
        this.seatNumber=seatNumber;
    }
    public double getTicketPrice(){
        return this.price;
    }
}
