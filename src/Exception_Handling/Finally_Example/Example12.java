package Exception_Handling.Finally_Example;

public class Example12 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            int[] arr = new int[Integer.MAX_VALUE];
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("main ends");
    }
}
