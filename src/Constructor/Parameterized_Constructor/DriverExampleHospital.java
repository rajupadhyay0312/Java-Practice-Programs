package Constructor.Parameterized_Constructor;

import java.util.*;

class Hospital{
    String name;
    String address;
    long contact;

    ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
    ArrayList<Patient> patientList = new ArrayList<Patient>();

    Hospital(String name, String address, long contact ){
        this.name=name;
        this.address=address;
        this.contact=contact;
    }
    public void displayHospital(){
        System.out.println("------------ HOSPITAL INFO -------------");
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Contact : "+contact+"\n______________________________");
    }
    public void addDoctor(Doctor doctor){
        doctorList.add(doctor);
    }
    public void addPatient(Patient patient){
        patientList.add(patient);
    }
    public void displayDoctorList(){
        for(Doctor obj : doctorList){
            obj.displayDoctor();
            System.out.println("\n_____________________________\n");
        }
    }
    public void displayPatientList(){
        for(Patient obj : patientList){
            obj.displayPatient();
            System.out.println("\n_______________________________\n");
        }
    }
}
class Patient{
    static int series = 2345;
    String patientId;
    String name;
    String address;
    long contact;
    String [] diseases;
    {
        this.patientId = "PTD"+series++;
    }
    Patient(String name, String address, long contact, String[] diseases){
        this.name=name;
        this.address=address;
        this.contact=contact;
        this.diseases=diseases;
    }
    public void displayPatient(){
        System.out.println(" ***** PATIENT INFO ***** ");
        System.out.println("PatientId : "+patientId);
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Contact : "+contact);
        System.out.println("Diseases : "+Arrays.toString(diseases)+"\n");
    }
}
class Doctor{
    String name;
    String spec;
    long contact;
    String [] days;

    Doctor( String name, String spec, long contact, String[] days){
        this.name=name;
        this.spec=spec;
        this.contact=contact;
        this.days = days;
    }
    public void displayDoctor(){
        System.out.println(" ***** DOCTOR INFO ***** ");
        System.out.println("Name : "+name);
        System.out.println("Speciality : "+spec);
        System.out.println("contact : "+contact);
        System.out.println("Visiting days : "+Arrays.toString(days)+"\n");
    }
}
public class DriverExampleHospital {
    public static void main(String[] args){
        Hospital hospital = new Hospital("sahyadri","Pune",9876545671L);
        hospital.displayHospital();


        String [] days1 = {"MON", "WED", "TUES"};
        Doctor d1 = new Doctor("D.r Ramesh Kumar", "Neuro", 987654321L, days1);
        hospital.addDoctor(d1);

        String [] days2 = {"MONDAY", "THURSDAY", "SATURDAY"};
        Doctor d2 = new Doctor("D.r Suresh Kumar", "CARDIO", 980054321L, days2);
        hospital.addDoctor(d2);

        String[] diseases1 = {"Fever", "Dizziness", "Cold"};
        Patient p1 = new Patient("Mukesh","Dattawadi Mashoba Chowk Pune", 6785432156L, diseases1);
        hospital.addPatient(p1);

        String[] diseases2 = {"Fever", "Food Poison"};
        Patient p2 = new Patient("Mukesh","Viman Nagar Pune", 6795400156L, diseases2);
        hospital.addPatient(p2);

        hospital.displayDoctorList();
        hospital.displayPatientList();
    }
}
