package StaticMember.StaticImport;
import static StaticMember.StaticImport.Demo2.addition;
public class Example1 {
    public static void main(String[] args){
        System.out.println("main");
        int op1 = addition(10,20);
        System.out.println(op1);
        int op2 = Demo2.addition(234,234);
        System.out.println(op2);
    }
}
class Demo2{
    public static int addition(int num1, int num2){
        System.out.println("addition from demo2 class");
        int add = num1+num2;
        return add;

    }
}
