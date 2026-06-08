package Exception_Handling.ThrowableClass;

public class GetCause_MethodExp1 {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println("main try");
            m1();
        }catch(Throwable e){
            System.out.println("main catch");
            System.out.println(e.getCause());
        }
    }
    public static void m1() throws Throwable {
        try{
            System.out.println("try m1");
            m2();
        }
        catch(Exception e){
            System.out.println("catch m1()");
            System.out.println(e.getCause());
            throw new Throwable("Something",e);
        }
    }
    public static void m2() throws Exception{
        try{
            System.out.println("try m2()");
            int a=10/0;
        }
        catch(ArithmeticException ae){
            System.out.println("catch m2");
            throw new Exception("kuchtoh",ae);
        }
    }
}
