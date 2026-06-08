package StaticMember.StaticBlock;

import java.util.Scanner;

public class PhonePePinValidation {
    static String systemPin;

    static{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin : ");
        String userPin = sc.next();
        String storePin = System.getenv("PhonePePin");

        if(userPin.equals(storePin)){
            System.out.println("Enter pin is valid");
            System.out.println("Application will be launched");
        }else{
            System.out.println("Invalid Pin");
            System.exit(0);
        }
    }
    public static void main(String[] args){
        launchApplication();
    }
    public static void launchApplication(){
        System.out.println("  *** WELCOME TO PHONE PAY *** ");
        System.out.println("Some feature ");
    }
}
