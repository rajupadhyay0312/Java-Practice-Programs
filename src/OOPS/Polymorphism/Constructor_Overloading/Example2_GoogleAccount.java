package OOPS.Polymorphism.Constructor_Overloading;

class GoogleAccount{
    private String firstName;
    private String lastName;
    private String dob;
    private long contact;
    private String gender;
    private String email;
    private String password;
    private String recoveryEmail;
    private long recoveryContact;

    public GoogleAccount(String firstName, String dob, long contact, String gender, String email,
                         String password, String recoveryEmail){
        this(firstName,"",dob,contact,gender, email,password,recoveryEmail,0);
    }

    public GoogleAccount(String firstName, String dob, long contact, String gender, String email,
                         String password, String recoveryEmail, long recoveryContact){
        this(firstName,"Rather not to say",dob,contact,gender, email,password,recoveryEmail,recoveryContact);
    }

    public GoogleAccount(String firstName, String lastName, String dob, long contact, String gender, String email,
                         String password, String recoveryEmail, long recoveryContact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.contact = contact;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.recoveryEmail = recoveryEmail;
        this.recoveryContact = recoveryContact;
    }
    public void getGoogleAccount(){
        System.out.println("\n*** GOOGLE ACCOUNT***");
        System.out.println("firstName :"+firstName);
        System.out.println("lastName :"+lastName);
        System.out.println("dob :"+dob);
        System.out.println("Contact :"+contact);
        System.out.println("Gender :"+gender);
        System.out.println("email :"+email);
        System.out.println("password :"+password);
        System.out.println("recoveryEmail :"+recoveryEmail);
        System.out.println("recoveryContact :"+((recoveryContact == 0)?"NA":recoveryContact));
    }
}
public class Example2_GoogleAccount {
    public static void main(String[] args) {
        GoogleAccount obj1 = new GoogleAccount("Ramesh","Kumar","12/02/2000",9876543213L,"Male",
                "ramesh@gmail.com","ramesh1234","ramesh12@gmail.com",74748293937L);
        obj1.getGoogleAccount();

        GoogleAccount obj2 = new GoogleAccount("Ramesh","12/02/2000",9876543213L,"Male",
                "ramesh@gmail.com","ramesh1234","ramesh12@gmail.com",74748293937L);
        obj2.getGoogleAccount();


        GoogleAccount obj3 = new GoogleAccount("Ramesh","12/02/2000",9876543213L,"Male",
                "ramesh@gmail.com","ramesh1234","ramesh12@gmail.com");
        obj3.getGoogleAccount();
    }
}
