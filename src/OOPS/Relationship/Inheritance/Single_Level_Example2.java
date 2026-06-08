package OOPS.Relationship.Inheritance;

import java.util.Arrays;

class Hospital {
    String name;
    String address;
    long contact;
    String[] doctorList;
    String[] department = {"ENT", "ORTHO", "NEURO", "SABKUCH"};

    public Hospital(String name, String address, long contact, String[] doctorList) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.doctorList = doctorList;
    }

    public void displayHospital() {
        System.out.println("\n HOSPITAL INFO ");
        System.out.println("Name :" + name);
        System.out.println("Address :" + address);
        System.out.println("Contact :" + contact);
        System.out.println("DoctorList : " + Arrays.toString(doctorList));
        System.out.println("Department : " + Arrays.toString(department));
    }
}

class Patient extends Hospital {
    static int id = 1232;
    int patientId;
    String name;
    int age;
    long contact;
    long emergencyContact;
    String address;
    String[] diseases;
    String bloodGroup;

    {
        patientId = id++;
    }

    public Patient(String name, int age, long contact, long emergencyContact, String address, String[] diseases, String bloodGroup) {
        this(name, age, contact, emergencyContact, address, diseases, bloodGroup, "Sahyadri", "Pune", 7894549955L, new String[]{"Dr.Mahesh Kumar", "Dr.Manisha"});
    }

    public Patient(String name, int age, long contact, long emergencyContact, String address, String[] diseases, String bloodGroup
            , String name1, String address1, long contact1, String[] doctorList) {
        super(name1, address1, contact1, doctorList);
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.emergencyContact = emergencyContact;
        this.address = address;
        this.diseases = diseases;
        this.bloodGroup = bloodGroup;
    }

    public void displayPatient() {
        System.out.println("\n PATIENT INFO");
        System.out.println("PatientId : " + patientId);
        System.out.println("Name : " + name);
        System.out.println("Age :" + age);
        System.out.println("Contact : " + contact);
        System.out.println("EmergencyContact : " + emergencyContact);
        System.out.println("Address : " + address);
        System.out.println("Diseases : " + Arrays.toString(diseases));
        System.out.println("Blood Group : " + bloodGroup);
    }
}

public class Single_Level_Example2 {
    public static void main(String[] args) {
        String[] diseases = {"FEVER", "COLD", "COUGH"};
        String[] doctorList = {"Dr.Suresh kumar", "Dr.Mahesh"};
        Patient p1 = new Patient("Ramesh Kumar", 21, 9876535674L, 6789345214L, "Deccan Pune", diseases, "B+",
                "Sahyadri", "Pune", 9999888777L, doctorList);

        p1.displayPatient();
        p1.displayHospital();


        String[] diseases2 = {"Stomach pain", "Headache", "FEVER"};
        Patient p2 = new Patient("Payal Kumari", 22, 9876535674L, 6789323104L, "Dattawadi Pune", diseases, "B+");
        p2.displayPatient();
        p2.displayHospital();

    }

}
