package Constructor.This_Call;

public class Example4 {
    {
        System.out.println("non- static block : "+this);
    }
    Example4(){
        System.out.println("constructor : "+this);
    }
    public static void main(String[] args){
        new Example4();
    }
}
