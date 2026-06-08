package Exception_Handling.CustomException;

import java.sql.SQLOutput;
import java.util.*;

class UserStringIndexOfBoundsException extends IndexOutOfBoundsException {
    UserStringIndexOfBoundsException(String desc) {
        super(desc);
    }
}

class UserNullPointerException extends RuntimeException {
    UserNullPointerException(String desc) {
        super(desc);
    }
}

class UserString {
    char[] arr;

    UserString(String str) {
        arr = str.toCharArray();
    }

    public String toString() {


        return new String(arr);
    }

    public int length(){
        return arr.length;
    }

    public char charAt(int index) {
        if (index < 0 || index >= arr.length)
            throw new UserStringIndexOfBoundsException("Index :" + index + " is invalid for length : " + arr.length);
        return arr[index];
    }
}

public class Example2 {
    public static void main(String[] args) {
       UserString str = new UserString("ABCDEFGHIJKLM");
        System.out.println(str);
        for(int i=0; i<=str.length(); i++){
            try{
                System.out.println(i+" : "+str.charAt(i));
            }
            catch (UserStringIndexOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(str.length());
         UserString str2 = null;
         if(str == null){
             throw new UserNullPointerException("Object is pointing toward null");
         }

        System.out.println(str2.length());
    }
}
