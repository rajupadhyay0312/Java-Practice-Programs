package Exception_Handling.Mutiple_CatchBlock;

public class Example7 {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println("Outer try");
            try{
                System.out.println("inner try");
                System.out.println(10/0);
            }
            catch(Exception e){
                System.out.println("Inner catch");
                System.out.println(args[0]);
            }
        }
        catch (Throwable t){
            System.out.println("Outer catch");
        }
        System.out.println("ends");
    }
}
