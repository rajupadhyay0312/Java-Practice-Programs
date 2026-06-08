package Non_StaticMember;

public class Example8 {
    String str;
    int a;

    Example8(){}

    Example8(String str, int a){
        this.str = str;
        this.a = a;
    }
    void displayExample8(){
        System.out.println(str+" "+ a);
    }
}
class ExampleDriver4{
    public static void main(String[] args){
        Example8 obj = new Example8();
        obj.str = "hello"; // manual initialization
        obj.a = 123;
        obj.displayExample8();

        Example8 obj1 = new Example8("java", 456); // constructor initialization
        obj1.displayExample8();
    }
}
