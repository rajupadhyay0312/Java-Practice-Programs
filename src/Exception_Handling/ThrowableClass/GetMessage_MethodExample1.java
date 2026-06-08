package Exception_Handling.ThrowableClass;

public class GetMessage_MethodExample1 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            int [] arr = {10,20};
            System.out.println(arr[2]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
