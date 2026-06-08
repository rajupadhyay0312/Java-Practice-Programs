package StaticMember.StaticVariable;

import java.util.Scanner;
import static StaticMember.StaticVariable.Example11.*;
public class Example5 {
    public static void main(String[] args){
        System.out.print("Enter a Num1: ");
        int num1 =userInput1;

        System.out.print("Enter a Num2: ");
        int num2 =userInput2;

        int add = num1+num2;
        System.out.println("Addition: "+add);
    }
}
class Example11{
    static int userInput1 = new Scanner(System.in).nextInt();
    static int userInput2 = new Scanner(System.in).nextInt();
}
