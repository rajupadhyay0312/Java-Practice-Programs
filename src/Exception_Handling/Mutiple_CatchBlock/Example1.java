package Exception_Handling.Mutiple_CatchBlock;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("exe start");
        try{
            System.out.println("try");
            System.out.println("hii".charAt(3));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundException");
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundException"); // CTE
//        }
    }
}
