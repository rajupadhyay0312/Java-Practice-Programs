package Exception_Handling.Finally_Example;

//Exception occurred outside the block
public class Scenario1 {
    public static void main(String[] args) {
        System.out.println("start");
        System.out.println(10/0);

        try{
            System.out.println("try");
        }
        catch(Exception e){
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("ends");
    }
}
