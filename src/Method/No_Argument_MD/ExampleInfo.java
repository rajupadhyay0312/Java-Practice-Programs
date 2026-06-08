package Method.No_Argument_MD;

import java.util.Scanner;

public class ExampleInfo {
    static String name;
    static String email;
    static String contact;
    static String yop;
    static double cgpa;

    public static void main(String[] args) {
        myInfo();

    }

    public static void myInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Name :");
        name = sc.next();

        System.out.print("Enter a email :");
        email = sc.next();

        System.out.print("Enter a contact :");
        contact = sc.next();

        System.out.println("Enter a yop :");
        yop = sc.next();

        System.out.print("Enter a cgpa :");
        cgpa = sc.nextDouble();

        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Contact : " + contact);
        System.out.println("YOP : " + yop);
        System.out.println("CGPA : " + cgpa);

    }
}
