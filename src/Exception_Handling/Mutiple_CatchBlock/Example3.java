package Exception_Handling.Mutiple_CatchBlock;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Start");
        try{
            System.out.println("try");
            System.out.println(10/0);
            System.out.println(args[1]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundException");
        }
        System.out.println("ends");
    }
}
