package OOPS.Polymorphism.Variable_Shadowing;

// Instance Variable Shadow by constructor parameters
class Student {
    String name;
    String email;
    String education;
    long contact;

    public Student(String name, String email, String education, long contact) {
        this.name = name;
        this.email = email;
        this.education = education;
        this.contact = contact;
    }

    public void getStudent() {
        System.out.println("Student [" +
                "name='" + name +
                ", email='" + email +
                ", education='" + education +
                ", contact=" + contact +
                ']');
    }
}

public class Scenario2 {
    public static void main(String[] args) {
        Student student = new Student("Ramesh", "ramesh@gmail.com", "BE_CSE", 98765432156L);
        student.getStudent();
    }
}
