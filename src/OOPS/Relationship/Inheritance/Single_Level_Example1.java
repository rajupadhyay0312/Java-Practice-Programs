package OOPS.Relationship.Inheritance;

import java.util.Arrays;

class Company{
    private String name;
    private String address;
    private String email;
    private long contact;
    private String CEO;
    String[] departmentList = {"Sales","Development","Designing"};

    public Company(String name, String address, String email, long contact, String CEO) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.contact = contact;
        this.CEO = CEO;
    }
    public void getCompanyInfo(){
        System.out.println("\n COMPANY INFO");
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Email : "+email);
        System.out.println("Contact : "+contact);
        System.out.println("CEO : "+CEO);
        System.out.println("Department : "+ Arrays.toString(departmentList));
    }
}
class Employee extends Company{
    private static int id = 123;
    private String empId;
    private String name;
    private long contact;
    private  String hrName;
    private String address;
    private String designation;
    private double salary;

    {
        empId = "EMP"+id++;
    }
    public Employee(String name, long contact, String hrName, String address, String designation, double salary)
    {
        this(name ,contact, hrName, address,designation,salary, "TATA MOTOR","Pune","tata@gmail.com",5363977292L,"Shailesh Chandra");
    }

    public Employee(String name, long contact, String hrName, String address, String designation, double salary, String name1, String address1,String email1,long contact1,String CEO)
    {
        super(name1,address1,email1,contact1,CEO);

        this.name = name;
        this.contact = contact;
        this.hrName = hrName;
        this.address = address;
        this.designation = designation;
        this.salary = salary;
    }
    public void getEmployeeInfo(){
        System.out.println("\n EMPLOYEE INFO");
        System.out.println("EMPID : "+empId);
        System.out.println("Name : "+name);
        System.out.println("Contact :"+contact);
        System.out.println("HR Name : "+hrName);
        System.out.println("Address : "+address);
        System.out.println("Designation : "+designation);
        System.out.println("Salary  :"+salary);
    }
}
public class Single_Level_Example1 {
    public static void main(String[] args) {
    Employee e1 = new Employee("Ramesh kumar",9857636478L,"Payal","Pune","Software Developer",500000,
    "TATA MOTOR","Mumbai","tata@gmail.com",7653223877L,"Shailesh Chandra");
    e1.getEmployeeInfo();
    e1.getCompanyInfo();

    Employee e2 = new Employee("Suresh Kumar",7654328980L,"Jyoti kumari","Delhi","Cloud Engineer",100000);
    e2.getEmployeeInfo();
    e2.getCompanyInfo();
    }
}
