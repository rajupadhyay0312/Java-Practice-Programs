package OOPS.Relationship.Has_a_Relationship.CompositionExample;

class Container{
    String str1 = "Container Object";
    Contained obj1 = new Contained();
}
class Contained{
    String str2 = "Contained Object";
}
public class Example {
    public static void main(String[] args) {
       Container obj = new Container();
        System.out.println(obj.str1);
        System.out.println(obj.obj1.str2);
    }
}
