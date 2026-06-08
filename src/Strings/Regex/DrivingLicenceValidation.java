package Strings.Regex;

import java.util.regex.Pattern;

public class DrivingLicenceValidation {
        public static void main(String[] args) {
            String str = "MH012025 0012345";
            System.out.println(isValid(str)?str+" valid":str+" invalid");
        }
        public static boolean isValid(String str){
            String regex ="^[A-Z]{2}\\d{2}\\d{4}\\s?-?\\d{7}$";
            return Pattern.matches(regex,str);
        }
}
