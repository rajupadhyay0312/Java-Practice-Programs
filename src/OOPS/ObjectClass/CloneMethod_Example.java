package OOPS.ObjectClass;

import java.util.Arrays;

class Address {
    String area;
    String city;
    String state;
    int pin;

    public Address(String area, String city, String state, int pin) {
        this.area = area;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }
}

class Education {
    String name;
    int pasOut;
    double cgpa;
    String university;

    public Education(String name, int pasOut, double cgpa, String university) {
        this.name = name;
        this.pasOut = pasOut;
        this.cgpa = cgpa;
        this.university = university;
    }

    @Override
    public String toString() {
        return "Education{" +
                "name='" + name + '\'' +
                ", pasOut=" + pasOut +
                ", cgpa=" + cgpa +
                ", university='" + university + '\'' +
                '}';
    }
}

class Student1 implements Cloneable {
    String name;
    String email;
    long contact;
    Address address;
    Education[] educations;

    public Student1(String name, String email, long contact, Address address, Education[] educations) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.educations = educations;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", educations=" + Arrays.toString(educations) +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneMethod_Example {
    public static void main(String[] args) throws CloneNotSupportedException {
        Education edu1 = new Education("SSC", 2019, 8.5, "Mah state board");
        Education edu2 = new Education("HSC", 2021, 8.7, "Mah state board");
        Education edu3 = new Education("BTech", 2019, 8.5, "RTMNU");

        Education[] educations = {edu1, edu2, edu3};
        Address address = new Address("Deccan JM Road", "PUNE", "MH", 411004);

        Student1 student1 =
                new Student1("Ramesh Kumar", "ramesh@gmail.com", 9876543123L, address, educations);
        System.out.println(student1);
        System.out.println(student1.address);
        System.out.println(student1);
        //System.out.println(Arrays.toString(educations));

        System.out.println("--------------clone imp---------------");

        //clone imp
        Student1 cloneObj = null;
        try {
            cloneObj = (Student1) student1.clone();
            System.out.println(cloneObj);
            System.out.println(cloneObj.address);
            System.out.println();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone is not supported for Student");
        }
        System.out.println("--------CHANGES IS CLONE-----------");
        cloneObj.address.area = "KARVE nagar";
        System.out.println(cloneObj.address);
        System.out.println("--------ORG OBJ-------");
        System.out.println(student1.address);
    }
}
