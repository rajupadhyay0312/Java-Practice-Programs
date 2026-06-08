package Strings.Regex;

import java.util.regex.Pattern;

public class CVV_Validation {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(isValid(str)?str+" valid":str+" inValid");
    }
    public static boolean isValid(String str){
        String regex = "^[0-9]{3,4}$";
        return Pattern.matches(regex,str);
    }
}
