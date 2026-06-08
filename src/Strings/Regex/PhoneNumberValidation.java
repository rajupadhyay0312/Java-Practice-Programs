package Strings.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        String[] phoneNumbers = {
                //Valid numbers;
                "9876543210",
                "9123456789",
                "8123456780",
                "7012345678",
                "+919876543210",
                "+919123455748",
                "+91 -9867543238",
                "+91 70937247763",
        };
        for(String contact : phoneNumbers){
            if(validContact(contact)){
                System.out.println(contact+" is valid");
            }else{
                System.out.println(contact+" is not valid");
            }
        }
    }
    public static boolean validContact(String str){
        String regex = "(\\+91)? ?-?[6-9]{1}[0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
