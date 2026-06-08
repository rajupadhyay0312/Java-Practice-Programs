package Strings.Regex;

import java.util.regex.Pattern;

public class Telephone_Validation {
    public static void main(String[] args) {
        String str = "020-24567890";
        System.out.println(isValid(str)?str+" valid":str+" inValid");
    }
    public static boolean isValid(String str){
        String regex = "^0[0-9]{2,4}[- ]?[0-9]{6,8}$";
        return Pattern.matches(regex,str);
    }
}
