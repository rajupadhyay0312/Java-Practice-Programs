package Exception_Handling;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("exe start");
        try{
            System.out.println("try");
            int [] arr = {10,20};
            System.out.println(arr[3]);
        }
        catch(NullPointerException e){
            System.out.println("cath");
        }
        System.out.println("exe ends");
    }
}
