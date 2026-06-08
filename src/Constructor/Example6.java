package Constructor;

class Suresh121{
    Suresh121(){
        this("abc");
        System.out.println("Suresh()");
    }
    Suresh121(String b){
      //  this(); // Recursive call
        System.out.println("String b");
    }
}
public class Example6 {
    public static void main(String[] args){
        Suresh121 obj = new Suresh121();
    }
}
