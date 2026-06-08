package OOPS.Polymorphism;

class Remote{
   public void universalRemote(){
       System.out.println("universal Remote");
   }
}
class Television{
    public void universalRemote(){
        System.out.println("universal remote for television");
    }
}
class Projector{
    public void universalRemote(){
        System.out.println("universal remote for projector");
    }
}
public class Example1 {
    public static void main(String[] args) {
      Television obj1 = new Television();
      obj1.universalRemote();

      Projector obj2 = new Projector();
      obj2.universalRemote();
    }
}
