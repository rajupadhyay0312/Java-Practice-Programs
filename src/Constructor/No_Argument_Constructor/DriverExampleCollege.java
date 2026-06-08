package Constructor.No_Argument_Constructor;

class College{
    String collegeName;
    String address;
    String university;
    String principle;

    College(String collegeName, String address, String university, String principle){
        this.collegeName = collegeName;
        this.address = address;
        this.university = university;
        this.principle = principle;
    }
    public void displayCollege(){
        System.out.println("\ncollege info");
        System.out.println("Name : "+collegeName);
        System.out.println("address : "+address);
        System.out.println("University : "+university);
        System.out.println("principle : "+principle);
    }
}
class Department extends College{
    String deptName;
    String hod;
    Department(String deptName, String hod){
        super("Raisoni","Nagpur","RTMNU", "Sachine Utwale");
        this.deptName = deptName;
        this.hod = hod;
    }
    public void displayDepartment(){
        System.out.println("\nDepartment info");
        System.out.println("Depart Name : "+deptName);
        System.out.println("HOD : "+hod);
    }
}
class Student extends Department{
    String name;
    String id;
    Long contact;

    Student(){
        super("COMPUTER SCIENCE", "SURESH KUMAR");
    }
    public void displayStudent(){
        System.out.println("Student Info ");
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Contact : "+contact);
    }
}
public class DriverExampleCollege {
    public static void main(String[] args){
       Student obj = new Student();
       obj.name = "Ramesh Kumar";
       obj.id = "Stu123";
       obj.contact = 987654321L;
       obj.displayStudent();
       obj.displayDepartment();
       obj.displayCollege();

    }
}
