package Exception_Handling.Finally_Example;

public class Scenario2{
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println("try");
            int [] arr = new int[-1];
        }
        catch(Exception e){
            System.out.println("catch");
            System.exit(0);
        }
        finally{
            System.out.println("finally");
        }
        System.out.println("ends");
    }
}
