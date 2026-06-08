package Non_StaticMember;

/* we cannot access any non-static member inside a static context without creating an object*/
public class Example1 {
    public static void main(String[] args){
        System.out.println("main() static ");
    }
    public void m1(){
        System.out.println("m1() non static ");
    }
}
