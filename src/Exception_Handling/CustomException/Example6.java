package Exception_Handling.CustomException;
import java.util.Scanner;

class InvalidCredentialException extends RuntimeException{
    InvalidCredentialException(String desc){
        super();
    }
}
class Credential{
    String userName;
    String password;
    long phoneNo;

    public Credential(String userName, String password, long phoneNo) {
        this.userName = userName;
        this.password = password;
        this.phoneNo = phoneNo;
    }
}
public class Example6 {
    public static void main(String[] args) {
        Credential obj = new Credential("Ramesh", "123", 9876543210L);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UserName: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        login(obj,user,pass);
    }
    public static void login(Credential obj,String user, String pass){
        if(obj.userName.equals(user) && obj.password.equals(pass)){
            System.out.println("Successfully Login");
        }else{
            throw new InvalidCredentialException("UserName and password is incorrect");
        }
    }
}
