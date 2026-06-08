package Exception_Handling.Mutiple_CatchBlock;

public class Example6 {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
            try{
                System.out.println("inner try");
                String str = null;
                System.out.println(str.charAt(0));
            }
            catch(ClassCastException cce){
                System.out.println("inner catch");
            }
        }
        catch (NullPointerException npe){
            System.out.println("NullPointerException");
        }
        System.out.println("ends");
    }
}
