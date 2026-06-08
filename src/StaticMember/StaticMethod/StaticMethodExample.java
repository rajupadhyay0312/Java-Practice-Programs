package StaticMember.StaticMethod;

/* Static method can be access inside any static member of the same class without any reference */
public class StaticMethodExample {
    static {
        System.out.println("Static block ");
        m2();
    }
    public static void main(String[] args){
        System.out.println("main()");
        m2();
    }
    public static void m2(){
        System.out.println("m2()");
    }
}
