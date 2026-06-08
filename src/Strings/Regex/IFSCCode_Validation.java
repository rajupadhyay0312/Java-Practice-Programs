package Strings.Regex;

import java.util.regex.Pattern;

public class IFSCCode_Validation {
    public static void main(String[] args) {
        String str = "SBIN0005943";
        System.out.println(isValid(str)?str+" valid":str+" invalid");
    }
    public static boolean isValid(String str){
        String regex ="^[A-Z]{4}0[A-Z0-9]{6}$";
        return Pattern.matches(regex,str);
    }
}
