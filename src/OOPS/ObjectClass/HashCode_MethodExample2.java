package OOPS.ObjectClass;

class Employee1 {
    String empId;
    String eName;
    Double salary;
    Long contact;
    String email;

    public Employee1(String empId, String eName, Double salary, Long contact, String email) {
        this.empId = empId;
        this.eName = eName;
        this.salary = salary;
        this.contact = contact;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "empId='" + empId + '\'' +
                ", eName='" + eName + '\'' +
                ", salary=" + salary +
                ", contact=" + contact +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        int hc = empId.hashCode() + eName.hashCode() + salary.hashCode() + contact.hashCode() + email.hashCode();
        return hc<0?hc*=-1:hc;
    }
}

public class HashCode_MethodExample2 {
    public static void main(String[] args) {
        Employee1 obj1 = new Employee1("EMP123", "Ramesh Kumar", 50000.0, 9876543212L, "ramesh@gmail.com");
        Employee1 obj2 = new Employee1("EMP123", "Ramesh Kumar", 50000.0, 9876543212L, "ramesh@gmail.com");
        Employee1 obj3 = new Employee1("EMP123", "Ramesh Kumar", 50000.0, 9876543212L, "ramesh@gmail.com");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

    }
}
