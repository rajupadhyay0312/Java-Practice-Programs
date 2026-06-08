package OOPS.Relationship.Inheritance;


class Google {
    String firstName;
    String lastName;
    String email;
    String gender;
    long contact;
    String dob;
    String password;

    public Google(String firstName, String lastName, String email, String gender, long contact, String dob, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.contact = contact;
        this.dob = dob;
        this.password = password;
    }

    public void displayGoogle() {
        System.out.println("\nGOOGLE [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", gender=" + gender +
                ", contact=" + contact + ", dob='" + dob + ", password='" + password + "]");
    }
}

class ClassRoom extends Google {
    String name;
    String id;
    String trainer;
    String subject;
    int student;

    public ClassRoom(String firstName, String lastName, String email, String gender, long contact, String dob, String password, String name, String id, String trainer, String subject, int student) {
        super(firstName, lastName, email, gender, contact, dob, password);
        this.name = name;
        this.id = id;
        this.trainer = trainer;
        this.subject = subject;
        this.student = student;
    }

    public void displayClassRoom() {
        System.out.println("CLASSROOM [" + "name=" + name + ", id=" + id + ", trainer=" + trainer  + ", subject=" + subject + ", student=" + student + "]");
    }
}

class Bank {
    String name;
    String ifscCode;
    long accountNumber;
    long card;
    int cvv;

    public Bank(String name, String ifscCode, long accountNumber, long card, int cvv) {
        this.name = name;
        this.ifscCode = ifscCode;
        this.accountNumber = accountNumber;
        this.card = card;
        this.cvv = cvv;
    }

    public void displayBank() {
        System.out.println("BANK [" + "name='" + name + ", ifscCode='" + ifscCode + ", accountNumber=" + accountNumber + ", card=" + card + ", cvv=" + cvv + "]");
    }
}

class GooglePay extends Google {
    String name;
    String upiPin;
    long contact;
    Bank bank = new Bank("SBI", "SBINOOO6757", 9876543210L, 123456777754332L, 123);

    public GooglePay(String firstName, String lastName, String email, String gender, long contact, String dob, String password, String name, String upiPin, long contact1) {
        super(firstName, lastName, email, gender, contact, dob, password);
        this.name = name;
        this.upiPin = upiPin;
        this.contact = contact1;
    }

    public void displayGooglePay() {
        System.out.println("GOOGLE_PAY [" + "name=" + name + ", upiPin=" + upiPin + ", contact=" + contact + "]");
        bank.displayBank();
    }
}

class GoogleMeet extends Google {
    String hostName;
    String link;
    String code;
    String scheduled;
    int participate;

    public GoogleMeet(String firstName, String lastName, String email, String gender, long contact, String dob, String password, String hostName, String link, String code, String scheduled, int participate) {
        super(firstName, lastName, email, gender, contact, dob, password);
        this.hostName = hostName;
        this.link = link;
        this.code = code;
        this.scheduled = scheduled;
        this.participate = participate;
    }

    public void displayGoogleMeet() {
        System.out.println("GOOGLE_MEET [hostName=" + hostName + ", link=" + link + ", code=" + code + ", scheduled=" + scheduled + ", participate=" + participate + "]");
    }
}

class GoogleDrive extends Google {
    double storage;
    int folder;
    int files;

    public GoogleDrive(String firstName, String lastName, String email, String gender, long contact, String dob, String password, double storage, int folder, int files) {
        super(firstName, lastName, email, gender, contact, dob, password);
        this.storage = storage;
        this.folder = folder;
        this.files = files;
    }

    public void displayGoogleDrive() {
        System.out.println("GOOGLE_DRIVE [" + "storage=" + storage + ", folder=" + folder + ", files=" + files + "]");
    }
}

public class Hierarchical_Inheritance_Example2 {
    public static void main(String[] args) {
        GooglePay googlePay = new GooglePay("Ramesh", "Kumar", "ramesh@gmail.com", "Male", 9876543210L, "01/01/2001", "ramesh@123", "Ramesh kumar", "1234", 9876543218L);
        googlePay.displayGoogle();
        googlePay.displayGooglePay();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        GoogleDrive googleDrive = new GoogleDrive("Suresh","Kumar","suresh@gmail.com","Male",987654222245L,"01/02/1999","suresh@123",15,1,10);
        googleDrive.displayGoogle();
        googleDrive.displayGoogleDrive();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        GoogleMeet googleMeet = new GoogleMeet("Raju","Kumar","raju@gmail.com","Male",987654222245L,"01/02/199","raju@123","Mahesh Kumar","https://mahesh.com/join","MAHESH0103","06/08/23",20);
        googleMeet.displayGoogle();
        googleMeet.displayGoogleMeet();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        ClassRoom classRoom = new ClassRoom("Ganesh","Kumar","ganesh@gmail.com","Male",987654222245L,"01/02/199","suresh@123","Ganesh","Gan0123","Vikash","IoT",60);
        classRoom.displayGoogle();
        classRoom.displayClassRoom();
    }
}
