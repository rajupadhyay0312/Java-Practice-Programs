package Exception_Handling.Finally_Example;

public class Example14 {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }
        finally{
            String str = null;
            str.isEmpty();
        }
    }
}
