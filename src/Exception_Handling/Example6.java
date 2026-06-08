package Exception_Handling;

public class Example6 {
    public static void main(String[] args) {
        System.out.println("exe start");
        try{
            System.out.println("try");
            System.out.println("hello1");
            Thread.sleep(2000);
            System.out.println("hello2");
        }
        catch(InterruptedException e){
            System.out.println("catch");
        }
        System.out.println("exe ends");
    }
}
