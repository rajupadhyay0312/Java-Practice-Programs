package Exception_Handling;

public class FirstWay_Of_HandlingException {
    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            m1();
        }catch(Throwable e){
            System.out.println("Exception Handle");
        }
        System.out.println("JAVA");
    }
    public static void m1() throws Throwable{
        System.out.println("Hello I am m1()");
    }
}
