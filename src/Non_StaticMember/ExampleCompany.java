package Non_StaticMember;

public class ExampleCompany {
    String name1;
    String address1;
    String email1;
    long contact1;
}
class Employee extends ExampleCompany{
    String name;
    String empId;
    String address;
    String email;
    long contact;

    public void displayEmployee(){
        System.out.println("company details");
        System.out.println("CompanyName : "+super.name1);
        System.out.println("Address : "+super.address1);
        System.out.println("Email : "+email1);
        System.out.println("Contact : "+super.contact1+"\n");
        System.out.println("EmpName : "+name);
        System.out.println("EmpId : "+empId);
        System.out.println("Address : "+address1);
        System.out.println("Email : "+email);
        System.out.println("Contact : "+this.contact);
    }
}
class ExampleDriver7{
    public static void main(String[] args){

        Employee obj = new Employee();
        obj.name = "RAMESH KUMAR";
        obj.empId = "QSP123";
        obj.address = "JM ROAD PUNE";
        obj.email = "ramesh123@gmail.com";
        obj.contact = 9876543213L;
        obj.name1 = "QSPIDER";
        obj.address1 = "DECCAN";
        obj.email1 = "ospide123@gmail.com";
        obj.contact1 = 8976543421L;

        obj.displayEmployee();
    }
}