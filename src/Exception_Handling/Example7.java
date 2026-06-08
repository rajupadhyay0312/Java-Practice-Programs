package Exception_Handling;

public class Example7 {
    public static void main(String[] args) {
        System.out.println("exe start");
        try{
            System.out.println("try");
            int [] arr = {10,20};
            System.out.println(arr[3]);
        }
        catch(Throwable e){
            System.out.println("catch");
        }
        System.out.println("catch");
    }
}
