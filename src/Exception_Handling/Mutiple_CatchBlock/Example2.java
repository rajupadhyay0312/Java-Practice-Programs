package Exception_Handling.Mutiple_CatchBlock;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("exe start");
        try{
            System.out.println("try");
            System.out.println("hii".charAt(3));
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundException");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundException");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundException");
        }
        System.out.println("Exe ends");
    }
}
