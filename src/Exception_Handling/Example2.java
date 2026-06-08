package Exception_Handling;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("exe start");
        try{
            System.out.println("hello1");
            System.out.println(10/0);
            System.out.println("hello2");
            System.out.println("hello3");
        }
        catch(Exception e){
            System.out.println("Catch");
        }
        System.out.println("exe ends");
    }
}
