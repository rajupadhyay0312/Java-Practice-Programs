package Exception_Handling.Finally_Example;

public class Example9 {
    public static void main(String[] args) {
        System.out.println("main() start");
        for(int i=0; i<=3; i++){
            try{
                System.out.println("try :"+i);
                if(i%2!=0)
                    System.out.println(10/0);
            }
            catch(ArithmeticException ae){
                System.out.println("catch : "+i);
                break;
            }
            finally{
                System.out.println("finally : "+i);
                continue;
            }
        }
        System.out.println("main() ends");
    }
}
