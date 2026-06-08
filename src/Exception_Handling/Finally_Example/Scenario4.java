package Exception_Handling.Finally_Example;

public class Scenario4 {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("catch");
            for(;;);
        }
        finally{
            System.out.println("finally");
        }
        System.out.println("ends");
    }
}
