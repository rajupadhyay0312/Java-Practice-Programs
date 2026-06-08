package Exception_Handling.Finally_Example;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println("try");
            try{
                System.out.println("inner try");
                System.out.println(args[0]);
            }
            catch(NullPointerException npe){
                System.out.println("Inner catch");
            }
            finally{
                System.out.println("Inner finally");
            }
        }
        catch(ArithmeticException ae){
            System.out.println("catch");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("outer catch");
        }
        finally{
            System.out.println("outer finally");
        }
        System.out.println("ends");
    }
}
