package Exception_Handling.CustomException;
import java.io.InputStream;
import java.util.Scanner;

class UserInputMisMatchException extends RuntimeException{
    UserInputMisMatchException(){
        this("");
    }
    UserInputMisMatchException(String desc){
        super(desc);
    }
}
class UserScanner{
    InputStream in;
    Scanner sc = new Scanner(System.in);
    UserScanner(InputStream in){
        this.in=in;
    }
    public int UserNextInt(){
        String ip = sc.next();
        int num =0;

        try{
           num =Integer.parseInt(ip);
        }catch(Exception e){
            throw new UserInputMisMatchException();
        }
        return num;
    }
}
public class Example4 {
    public static void main(String[] args) {
        UserScanner sc = new UserScanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.UserNextInt();
        System.out.println(num);
    }
}
