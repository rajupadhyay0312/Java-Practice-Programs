package Exception_Handling.Finally_Example;

public class Example13 {
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println(m1());
    }
    public static int m1(){
        try{
            return 10;
        }
        catch (Exception e){
            return 20;
        }
        finally{
            return 40;
        }
    }
}
