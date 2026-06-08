package StaticMember.StaticBlock;

public class Example1 {
    static{
        System.out.println("Sb1");
    }
    public static void main(String[] args){
        System.out.println("main()");
        m1();
    }
    static{
        System.out.println("Sb2");
    }
    public static void m1(){
        System.out.println("m1()");
    }
    static{
        System.out.println("Sb3");
    }
}
