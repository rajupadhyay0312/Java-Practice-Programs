package OOPS.Polymorphism.Variable_Shadowing;

//Variable shadowing in blocks(local variable hiding)
public class Scenario8 {
    public static void main(String[] args) {
        int num1 = 123112;
        {
            int num=123;
            System.out.println(num);
        }
        {
            int num = 456;
            System.out.println(num);
        }
    }
}

//class Demo2{
//    public static void main(String[] args) {
//        int num1 = 456;
//        {
//            int num1 = 123; // Variable num1 is already defined in the scope
//            System.out.println(num1);
//        }
//    }
//}