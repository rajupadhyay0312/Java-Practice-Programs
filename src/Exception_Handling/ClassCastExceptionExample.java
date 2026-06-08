package Exception_Handling;

class Parent{}
class Child extends Parent{}
class GrandChildA extends Child{}
class GrandChildB extends Child{}
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Child obj = new GrandChildB();
        Parent obj1 =(GrandChildB)obj;
        try{
            System.out.println("try");
            GrandChildA obj2 = (GrandChildA)obj1;
        }
        catch (ClassCastException e){
            System.out.println("Exception handle");
        }
    }
}
