package Exception_Handling.Mutiple_CatchBlock;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println("try");
            try{
                System.out.println("inner try");
                String str = null;
                System.out.println(str.charAt(0));
            }
            catch(ClassCastException cce){
                System.out.println("Inner catch");
            }
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch(NullPointerException npe){
            System.out.println("NullPointerException");
        }
        System.out.println("ends");
    }
}
