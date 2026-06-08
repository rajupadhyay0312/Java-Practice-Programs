package Exception_Handling;

public class ExceptionExample2 {
    public static void main(String[] args) {
        String str = "HELLO JAVA";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception handle");
            }
        }
    }
}
