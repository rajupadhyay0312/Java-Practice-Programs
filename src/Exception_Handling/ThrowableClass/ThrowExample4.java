package Exception_Handling.ThrowableClass;

public class ThrowExample4 {
    public static void main(String[] args) {
        System.out.println("main start");
        try{
            System.out.println("try");
            throw new ClassCastException("CCE Occurred");

        }catch(ClassCastException cce){
            System.out.println("CCE");
            System.out.println(cce.getMessage());
        }
    }
}
