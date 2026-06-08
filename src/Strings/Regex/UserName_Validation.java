package Strings.Regex;

import java.util.regex.Pattern;

public class UserName_Validation {
    public static void main(String[] args) {
        String str = "Raj_Upadhyay";
        System.out.println(isValid(str)?str+" valid":str+" inValid");
    }
    public static boolean isValid(String str){
        String regex = "^[\\w\\d]+$";
        return Pattern.matches(regex,str);
    }
}
