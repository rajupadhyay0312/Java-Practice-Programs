package Arrays.Day6_14_02_26.StudentApplication;

import java.util.Scanner;

public class StudentManagementApp {
    static Student [] studentList = new Student[20];
    static int index;

    public void launchApplication(){
        Scanner sc = new Scanner(System.in);

        for ( ; ; ){
            System.out.println("\n**** WELCOME **** n");
            System.out.println("1. CREATE STUDENT");
            System.out.println("2. VIEW ALL STUDENTS");
            System.out.println("3. UPDATE STUDENT");
            System.out.println("4. DELETE STUDENT");
            System.out.println("5. SEARCH STUDENT");
            System.out.println("6. EXIT");
            System.out.print("Enter your option: ");
            int option = sc.nextInt();

            switch (option){
                case 1 -> createStudent();
                case 2 -> viewAllStudent();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> searchStudent();
                case 6 -> exit();
            }
        }
    }

    private Object exit(){
        System.exit(0);
        return null;
    }

    private void searchStudent(){

        if (index == 0) {
            System.out.println("\n *** LIST IS EMPTY *** \n");
            return;
        }

        System.out.print("Enter contact to search: ");
        long contact = new Scanner(System.in).nextLong();

        for (int i = 0; i < index; i++) {
            if (studentList[i].contact == contact) {
                System.out.println("\n *** STUDENT FOUND ***\n");
                System.out.println(studentList[i]);

                for (int j = 0; j < studentList[i].eduIndex; j++) {
                    System.out.println(studentList[i].education[j]);
                }
                return;
            }
        }

        System.out.println("\n *** STUDENT NOT FOUND ***\n");
    }



    private void deleteStudent(){
        if (index == 0) {
            System.out.println("\n *** LIST IS EMPTY *** \n");
            return;
        }

        System.out.print("Enter contact to delete: ");
        long contact = new Scanner(System.in).nextLong();

        for (int i = 0; i < index; i++) {
            if (studentList[i].contact == contact) {

                // shift elements left
                for (int j = i; j < index - 1; j++) {
                    studentList[j] = studentList[j + 1];
                }

                studentList[index - 1] = null;
                index--;

                System.out.println("\n *** STUDENT DELETED SUCCESSFULLY ***\n");
                return;
            }
        }

        System.out.println("\n *** STUDENT NOT FOUND ***\n");

    }

    private void updateStudent(){
        if (index == 0) {
            System.out.println("\n *** LIST IS EMPTY *** \n");
            return;
        }

        System.out.print("Enter contact to update: ");
        long contact = new Scanner(System.in).nextLong();

        for (int i = 0; i < index; i++) {
            if (studentList[i].contact == contact) {

                System.out.println("\n *** STUDENT FOUND ***\n");
                System.out.println("1. Update Name");
                System.out.println("2. Update Contact");
                System.out.println("3. Add Education");
                System.out.print("Enter option: ");

                int option = new Scanner(System.in).nextInt();

                switch (option) {
                    case 1 -> {
                        System.out.print("Enter new name: ");
                        String newName = new Scanner(System.in).next();
                        studentList[i].name = newName;
                        System.out.println("Name updated successfully");
                    }

                    case 2 -> {
                        System.out.print("Enter new contact: ");
                        long newContact = new Scanner(System.in).nextLong();
                        studentList[i].contact = newContact;
                        System.out.println("Contact updated successfully");
                    }

                    case 3 -> {
                        if (studentList[i].eduIndex == studentList[i].education.length) {
                            System.out.println("Education array is full");
                            return;
                        }

                        System.out.println("\n**** Enter Education Information **** \n");
                        System.out.print("University: ");
                        String university = new Scanner(System.in).nextLine();
                        System.out.print("Course: ");
                        String course = new Scanner(System.in).nextLine();
                        System.out.print("Yop: ");
                        int yop = new Scanner(System.in).nextInt();
                        System.out.print("CGPA: ");
                        double cgpa = new Scanner(System.in).nextDouble();

                        Education eduObj = new Education(university, course, yop, cgpa);

                        studentList[i].education[studentList[i].eduIndex++] = eduObj;

                        System.out.println("Education added successfully");
                    }
                }
                return;
            }
        }

        System.out.println("\n *** STUDENT NOT FOUND ***\n");
    }
    private void viewAllStudent(){
        if(studentList[0] == null){
            System.out.println("\n *** LIST IS EMPTY **  \n");
            return;
        }

        System.out.println("\n  *** FILTER ***  \n");
        System.out.println("1.Based on YOP (Desc)");
        System.out.println("2.Based on Name (Asc)");
        System.out.println("3.Based on CGPA (Desc)");
        System.out.println("4.Based on SID (Asc)");
        System.out.print("\n Enter your option: ");
        int option = new Scanner(System.in).nextInt();
        switch (option){
            case 1 -> {
                sortYop();
                displayStudent();
                break;
            }
            case 2 -> {
                sortName();
                displayStudent();
                break;
            }
            case 3 -> {
                sortCgpa();
                displayStudent();
                break;
            }
        }
    }

    private void sortCgpa(){
        for (int i=0;i<index;i++){
            for (int j=i+1;j<index;j++){
                if(studentList[i].education[0].cgpa <
                        studentList[j].education[0].cgpa){
                    Student temp = studentList[i];
                    studentList[i] = studentList[j];
                    studentList[j] = temp;
                }
            }
        }
    }

    private void sortName(){
        for (int i=0;i<index;i++){
            for (int j=i+1;j<index;j++){
                if(studentList[i].name.compareTo(studentList[j].name)<0){
                    Student temp = studentList[i];
                    studentList[i] = studentList[j];
                    studentList[j] = temp;
                }
            }
        }
    }
    private void sortYop(){
        for (int i=0;i<index;i++){
            for (int j=i+1;j<index;j++){
                if(studentList[i].education[0].yop < studentList[j].education[0].yop){
                    Student temp = studentList[i];
                    studentList[i] = studentList[j];
                    studentList[j] = temp;
                }
            }
        }
    }

    public void displayStudent(){
        System.out.println("\n******* STUDENT LIST ********\n");
        for (int i=0;i<index;i++){
            System.out.println(studentList[i]);
            for (int j=0;j<studentList[i].eduIndex; j++){
                System.out.println(studentList[i].education[j]);
            }
            System.out.println("________________________________");
        }
    }

    public void createStudent(){
        System.out.println("\n ******* CREATE STUDENT MODULE *******\n");
        System.out.print("Name: ");
        String name = new Scanner(System.in).next();
        System.out.print("Contact: ");
        long contact = new Scanner(System.in).nextLong();

        Education [] eduArr = new  Education [5];
        int indexEdu = 0;
        for(int i =0;i<=eduArr.length;i++){
            System.out.println("\n**** Enter Education Information **** \n");
            System.out.print("University: ");
            String university = new Scanner(System.in).nextLine();
            System.out.print("Course: ");
            String course = new Scanner(System.in).nextLine();
            System.out.print("Yop: ");
            int yop = new  Scanner(System.in).nextInt();
            System.out.print("CGPA: ");
            double cgpa = new  Scanner(System.in).nextDouble();

            Education eduObj = new Education(university,course,yop,cgpa);
            eduArr[indexEdu++] = eduObj;

            System.out.print("Do you want to add more edu info: ");
            String resp = new Scanner(System.in).next().toUpperCase();
            if(resp.equals("NO")){
                break;
            }
        }

        Student student = new Student(name, contact,eduArr,indexEdu);
        studentList[index++] = student;
        System.out.println("\n STUDENT ADDED SUCCESSFULLY\n");

    }
}
