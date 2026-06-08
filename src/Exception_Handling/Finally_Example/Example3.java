package Exception_Handling.Finally_Example;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println("try");
            System.out.println(1/0);
            try{
                System.out.println("inner try");
            }
            catch(NullPointerException npe){
                System.out.println("inner catch");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("outer catch 2");
        }
        finally{
            System.out.println("outer finally");
        }
        System.out.println("end");
    }
}
