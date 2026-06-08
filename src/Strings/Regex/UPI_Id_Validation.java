package Strings.Regex;

import java.util.regex.Pattern;

public class UPI_Id_Validation {
        public static void main(String[] args) {

            String[] upiIds = {
                    "raj123@oksbi",
                    "rahul.sharma@okaxis",
                    "9876543210@ybl",
                    "raj@",
                    "@oksbi",
                    "raj#123@oksbi"
            };
            for(String upi : upiIds){
                if(isValid(upi)){
                    System.out.println(upi + " -> Valid UPI ID");
                } else {
                    System.out.println(upi + " -> Invalid UPI ID");
                }
            }
        }

        public static boolean isValid(String upi){
            String regex = "^[a-zA-Z0-9._-]{2,}@[a-zA-Z]{2,}$";
            return Pattern.matches(regex, upi);
        }
}
