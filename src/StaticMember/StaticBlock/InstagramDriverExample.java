package StaticMember.StaticBlock;

import java.util.Scanner;

public class InstagramDriverExample {
    static String usernameDb;
    static String passwordDb;

    public static void main(String[] args){
        usernameDb = args[0];
        passwordDb = args[1];

        Instagram obj = new Instagram();
    }
}
class Instagram{
    static String username1 = "ramesh123";
    static String password1 = "ramesh@123";

    static Scanner sc = new Scanner(System.in);

    static{
        String[] arr = getSystemEnvVar();
        String url = "jdbc:"+arr[0] + "://localhost:"+arr[1] + "/" + arr[2];

        boolean response = getConnection(url,InstagramDriverExample.usernameDb,InstagramDriverExample.passwordDb);

        if(response){
            System.out.println("DB connection Successfully");
            login();
        }else{
            System.out.println("DB Connection failed");
        }
    }
    public static boolean getConnection(String url, String username1, String password1){
        String usernameDb = System.getenv("usernamedb");
        String passwordDb = System.getenv("passwordb");

        if(usernameDb.equals(username1) && passwordDb.equals(password1)){
            return true;
        }
        return false;
    }
    public static String[] getSystemEnvVar(){
        String databaseServer = System.getenv("database");
        String localHost = System.getenv("localhost");
        String databaseName = System.getenv("databaseName");

        String[] arr = {databaseServer, localHost, databaseName};

        return arr;
    }
    public static void login(){
        System.out.println(" WELCOME TO INSTAGRAM ");
        System.out.println("username: ");
        String username2 = sc.next();
        System.out.println("password: ");
        String password2 = sc.next();

        if(username1.equals(username2) && password1.equals(password2)){
            System.out.println("login success ");
        }else{
            System.out.println("Invalid");
        }
    }
}