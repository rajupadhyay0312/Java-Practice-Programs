package Constructor;

class Ramesh1{
    Ramesh1(){
        this(10);
        System.out.println("Ramesh");
    }
    Ramesh1(int a){
        System.out.println("Ramesh(int a)");
    }
}
class Suresh1 extends Ramesh1{
    Suresh1(){
        this("Hello");
        System.out.println("Suresh");
    }
    Suresh1(String a){
        super();
        System.out.println("Suresh(String b)");
    }
}
public class Example4 {
    public static void main(String[] args){
        System.out.println("Start");
        Suresh1 obj =  new Suresh1();
    }
}
