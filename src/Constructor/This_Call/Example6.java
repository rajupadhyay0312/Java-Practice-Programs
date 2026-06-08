package Constructor.This_Call;

public class Example6 {
    String str = "Global";
    public void m1(){
        System.out.println("m1() non-static");
    }
    public void m2(){
        System.out.println("m2() non static ");
        this.m1();
        System.out.println(this.str);
    }
    public static void main(String[] args){
       Example6 obj = new Example6();
       obj.m1();
       obj.m2();
    }
}
