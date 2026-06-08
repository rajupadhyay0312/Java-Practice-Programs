package OOPS.Abstraction;

abstract class Demo2{
    {
        System.out.println("Hello from abstract class non-static block");
    }
}
class Example123 extends Demo2{
    {
        System.out.println("Hello from concrete class non-static block");
    }
}
public class Example7 {
    public static void main(String[] args) {
        Demo2 obj = new Example123();
    }
}
// 1. we can declare a non-static block inside abstract class Because non -static
// block byte code is present inside the constructor bytecode at compilation.
// 2. an abstract class contain constructor so we can have non-static block in it.
// 3. this non-static block get execute at the time of constructor chaining.
