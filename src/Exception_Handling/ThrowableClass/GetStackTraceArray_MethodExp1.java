package Exception_Handling.ThrowableClass;


public class GetStackTraceArray_MethodExp1 {
    public static void main(String[] args) {
        System.out.println("main start");
        m1();
        System.out.println("main end");
    }
    public static void m1(){
        try{
            System.out.println("try");
            m2();
        }
        catch(Exception e){
            System.out.println("catch");
            StackTraceElement[] arr = e.getStackTrace();

            for(StackTraceElement ele : arr){
                System.out.println(ele);
            }
        }
    }
    public static void m2(){
        System.out.println("m2()");
        Example2.m3();
    }
}
class Example2{
    public static void m3(){
        System.out.println("m3()");
        m4();
    }
    public static void m4(){
        System.out.println("m4()");
    }
}
