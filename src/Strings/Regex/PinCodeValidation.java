package Strings.Regex;

import java.util.regex.Pattern;

public class PinCodeValidation {
    public static void main(String[] args) {
        String[] pinCodes = {
                "411001",   // valid
                "110001",   // valid
                "560034",   // valid
                "041100",   // invalid
                "41100",    // invalid
                "4110012",  // invalid
                "41A001"    // invalid
        };
        for(String pin : pinCodes){
            if(isValid(pin)){
                System.out.println(pin + " -> Valid PIN Code");
            } else {
                System.out.println(pin + " -> Invalid PIN Code");
            }
        }
    }
    public static boolean isValid(String str){
        String regex = "^[1-9][0-9]{5}$";
        return Pattern.matches(regex,str);
    }
}
