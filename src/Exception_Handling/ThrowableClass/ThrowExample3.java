package Exception_Handling.ThrowableClass;

public class ThrowExample3 {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println("try");
            throw new NullPointerException();
        }catch(NullPointerException npe){
            System.out.println("NullPointerException Handled");
            System.out.println(npe.getMessage());
        }
        System.out.println("ends");
    }
}
