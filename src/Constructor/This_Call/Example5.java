package Constructor.This_Call;

public class Example5 {
    static Example5 obj = new Example5();
    {
        System.out.println(obj);
        System.out.println("Non-static block :"+this);
    }
    Example5(){
        System.out.println(obj);
        System.out.println("constructor :"+this);
    }
    public static void main(String[] args){
        System.out.println("hello");
        System.out.println(obj);
    }

}
