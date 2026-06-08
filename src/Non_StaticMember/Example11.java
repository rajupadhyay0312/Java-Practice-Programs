package Non_StaticMember;

/* We can execute a java program using non-static block along with static variable without main()*/
import java.util.Scanner;
public class Example11 {
    static int addition = userInput() + userInput();
    static Example11 obj = new Example11();

    {
        System.out.println("non-static block");
        System.out.println("Addition:"+addition);
        System.exit(0);
    }
    public static int userInput(){
        System.out.println("Enter a Number: ");
        int num = new Scanner(System.in).nextInt();
        return num;
    }
}
