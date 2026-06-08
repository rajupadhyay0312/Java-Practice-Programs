package Constructor;

// With the help of constructor we can initialize the data member of the base class from the child class...
class Parent{
    String parentStr;
    Parent(String parentStr){
        super();
        this.parentStr = parentStr;
    }
}
class Child extends Parent{
    String childStr;
    Child(String parentStr, String childStr){
        super(parentStr);
        this.childStr = childStr;
    }
}
public class Example2 {
   public static void main(String[] args){
       Child obj = new Child("Parent var", "Child var");

       System.out.println("Parent variable : " + obj.parentStr);
       System.out.println("Child variable  : " + obj.childStr);
   }
}
