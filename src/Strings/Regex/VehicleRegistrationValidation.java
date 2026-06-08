package Strings.Regex;


import java.util.regex.Pattern;

public class VehicleRegistrationValidation {
    public static void main(String[] args) {
        String str = "MH 01 AB 1234";
        System.out.println(isValid(str)?str+" valid":str+" invalid");
    }
    public static boolean isValid(String str){
        String regex ="^[A-Z]{2}\\s?-?\\d{2}\\s?-?[A-Z]{2}\\s?-?\\d{1,4}$";
        return Pattern.matches(regex,str);
    }
}
