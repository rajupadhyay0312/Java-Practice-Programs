package Exception_Handling;

public class Example1 {
    public static void main(String[] args) {
        try{
            System.out.println("exe start");
            System.out.println("Hello1");
            System.out.println("Hello2");
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("Catch");
        }
        System.out.println("exe ends");
    }
}
