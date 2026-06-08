package Constructor;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

class DataBaseConnection {
    private final String DATA_BASE_CONNECTION;
    private final String TABLE_NAME;
    private final String USER;
    private final String PASSWORD;

    private static DataBaseConnection obj;

    private DataBaseConnection() {}

    {
        this.DATA_BASE_CONNECTION = System.getenv("dataBaseName");
        this.TABLE_NAME = System.getenv("tableName");
        this.USER = System.getenv("user");
        this.PASSWORD = System.getenv("pass");
    }

    public void getConnection(String url, String user, String pass) {
        System.out.println("\n DB CONNECTION SUCCESSFULLY\n");
    }

    public static DataBaseConnection getInstance() {
        if (obj != null) {
            return obj;
        }
        obj = new DataBaseConnection();
        return obj;
    }
}

class UserAccount {
    String name;
    String password;
    String email;
    long contact;
    String dob;

    UserAccount(String name, String password, String email, long contact, String dob) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.contact = contact;
        this.dob = dob;
    }

    public void displayUserAccount() {
        System.out.println("\n**** USER INFO ***** ");
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
        System.out.println("Contact: " + contact);
        System.out.println("DoB: " + dob);
    }
}

class Facebook {
    UserAccount user = null;

    {
        System.out.println("Before APP launch, DB should be connected");
        DataBaseConnection obj = DataBaseConnection.getInstance();

        String dataBaseName = System.getenv("DataBaseName");
        String url = "jdbc:mysql://localhost:3306/" + dataBaseName;
        String user = System.getenv("user");
        String pass = System.getenv("pass");

        obj.getConnection(url, user, pass);
    }

    // 🔹 Save created account to user.properties
    public void saveUserToProperties(UserAccount user) {
        try {
            Properties props = new Properties();

            props.setProperty("username", user.name);
            props.setProperty("password", user.password);

            FileOutputStream fos = new FileOutputStream("user.properties");
            props.store(fos, "User Login Details");
            fos.close();

            System.out.println("\n✔ Account saved successfully!\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 Load existing stored account from user.properties
    public Properties loadUserProperties() {
        Properties props = new Properties();

        try {
            File file = new File("user.properties");
            if (!file.exists()) {
                return props;
            }

            FileInputStream fis = new FileInputStream(file);
            props.load(fis);
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return props;
    }

    public void login() {
        Properties props = loadUserProperties();

        if (props.getProperty("username") == null) {
            System.out.println("\n No account exists. Please create an account first.\n");
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** LOGIN MODULE ***");
        System.out.print("Username: ");
        String inputUser = sc.next();

        System.out.print("Password: ");
        String inputPass = sc.next();

        String storedUser = props.getProperty("username");
        String storedPass = props.getProperty("password");

        if (inputUser.equals(storedUser) && inputPass.equals(storedPass)) {
            System.out.println("\nLOGIN SUCCESSFUL!\n");
            features();
        } else {
            System.out.println("\nINVALID CREDENTIALS!\n");
        }
    }

    public void features() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n FEATURES ");
            System.out.println("1. ADD FRIEND");
            System.out.println("2. PROFILE");
            System.out.println("3. Logout");
            System.out.print("Enter: ");

            int resp = sc.nextInt();

            switch (resp) {
                case 1 -> System.out.println("\n ADD FRIEND MODULE\n");
                case 2 -> System.out.println("\n PROFILE MODULE \n");
                case 3 -> {
                    System.out.println("\nLOGOUT SUCCESSFUL\n");
                    return;
                }
                default -> System.out.println("INVALID RESPONSE");
            }
        }
    }

    public void launchApplication() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWELCOME USER");
            System.out.println("1. Login");
            System.out.println("2. Create Account");

            System.out.print("\nEnter your option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1 -> login();
                case 2 -> createAccount();
                default -> System.out.println("INVALID Option");
            }
        }
    }

    public void createAccount() {
        System.out.println("\n**** ACCOUNT CREATION MODULE ******");

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Password : ");
        String password = sc.next();

        System.out.print("Email : ");
        String email = sc.next();

        System.out.print("Contact : ");
        long contact = sc.nextLong();

        System.out.print("DOB : ");
        String dob = sc.next();

        user = new UserAccount(name, password, email, contact, dob);

        // save to properties file
        saveUserToProperties(user);
    }
}

public class Using_Singleton_FacebookApp {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.launchApplication();
    }
}
