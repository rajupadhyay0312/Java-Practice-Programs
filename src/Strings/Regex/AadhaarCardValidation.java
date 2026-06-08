package Strings.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AadhaarCardValidation {
    public static void main(String[] args) {
        String str = "2234-1234-1234";
        System.out.println(isValid(str)?str+" is valid":str+" invalid");
    }
    public static boolean isValid(String str){
        String regex = "[2-9]{1}[0-9]{3} ?-?\\d{4} ?-?[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
