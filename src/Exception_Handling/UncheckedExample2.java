package Exception_Handling;

public class UncheckedExample2 {
    public static void main(String[] args) {
        String str = new String("Hello");
        System.out.println(str.isEmpty());
        try{
            str = null;
        }
        catch(NullPointerException e){
            System.out.println("exception handle");
        }
        System.out.println(str.isEmpty());
    }
}
