package Exception_Handling.Finally_Example;

public class Scenario5 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        Thread curr = Thread.currentThread();
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("catch");
            curr.join();
        }
        finally{
            System.out.println("finally");
        }
    }
}
