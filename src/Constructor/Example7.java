package Constructor;

class Ramesh11{
    Ramesh11(){
        new Suresh11();
        System.out.println("Parent()");
    }
}
class Suresh11 extends Ramesh11{
    Suresh11(){
        super();
        System.out.println("child");
    }
}
public class Example7 {
    public static void main(String[] args){
        new Suresh11();
    }
}
