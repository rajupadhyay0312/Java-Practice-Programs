package Exception_Handling.Finally_Example;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println("try");
            System.out.println(10/0);
            try{
                System.out.println("inner try");
            }
            finally{
                System.out.println("Inner finally");
            }
        }
        catch(ArithmeticException ae){
            System.out.println("outer catch 1");
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
