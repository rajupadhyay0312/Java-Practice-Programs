package StaticMember;

class Student {
    static String batchCode;
    String name;
    String emailId;
    long contact;

    public Student(String batchCode, String name, String emailId, long contact) {
        this.batchCode = batchCode;
        this.name = name;
        this.emailId = emailId;
        this.contact = contact;
    }

    public void displayStudent() {
        System.out.println("Student[" +"batchCode :"+batchCode+
                " name='" + name +
                ", emailId='" + emailId +
                ", contact=" + contact +
                ']');
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Student obj1 = new Student("123","Ramesh","ramesh@gmail.com",9876543219L);
        obj1.displayStudent();
    }
}
