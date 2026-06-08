package StaticMember.StaticBlock;

public class Example2 {
    static{
        System.out.println("static block Example2 class");
    }
    public static void main(String[] args){
        System.out.println("main");
    }
}
class Example3{
    static String str = "Example3 class var";

    static{
        System.out.println("static block example 3 class");
    }
}
