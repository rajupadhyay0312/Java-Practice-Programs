package Exception_Handling;

public class CheckedExample2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        //m1();
        System.out.println("Java");
    }
    public static void m1() throws Throwable{
        System.out.println("Hello I am m1()");
    }
}
