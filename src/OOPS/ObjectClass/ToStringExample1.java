package OOPS.ObjectClass;

class Student {
    String sid;
    String sName;
    int yop;
    double cgpa;
    long contact;

    public Student(String sid, String sName, int yop, double cgpa, long contact) {
        this.sid = sid;
        this.sName = sName;
        this.yop = yop;
        this.cgpa = cgpa;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sName='" + sName + '\'' +
                ", yop=" + yop +
                ", cgpa=" + cgpa +
                ", contact=" + contact +
                '}';
    }
}
public class ToStringExample1 {
    public static void main(String[] args) {
        Student obj1 = new Student("SID123","Ramesh Kumar",2025,8.5,9876543212L);
        System.out.println(obj1);

        Student obj2 = new Student("SID124","Suresh Kumar",2026,9.5,9876674212L);
        System.out.println(obj2);
    }
}
