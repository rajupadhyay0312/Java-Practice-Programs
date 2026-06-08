package Constructor.This_Call;

public class Example2 {
    String str="Global";
    public static void main(String[] args){
        new Example2().m1();
    }
    public void m1(){
        String str = "local";
        System.out.println(str);
        System.out.println(this.str);
    }
}
