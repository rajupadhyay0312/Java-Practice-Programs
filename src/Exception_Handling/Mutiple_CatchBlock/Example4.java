package Exception_Handling.Mutiple_CatchBlock;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("Start");
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
            System.out.println(args[1]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("AIOOBE");
        }
        System.out.println("end");
    }
}
