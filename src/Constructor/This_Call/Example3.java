package Constructor.This_Call;

public class Example3 {
    {
        System.out.println("Non-static block :"+ this);
    }
    Example3(){
        System.out.println("constructor :"+this);
    }
    public static void main(String[] args){
        new Example3().m1();
    }
    public void m1(){
        System.out.println("m1() : "+this);
    }
}
