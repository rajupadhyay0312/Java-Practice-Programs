package WrapperClass;

/*
* 1.Manually process of converting a primitive type into it's corresponding
*   wrapper object is known as boxing...
* 2.this conversion can be done by constructor(deprecated) or factory methods
* */
public class BoxingExample {
    public static void main(String[] args) {
        int a = 123;
//      Integer obj1 = new Integer(a); // Deprecated
        Integer obj2 = Integer.valueOf(a); // boxing(explicit)
        System.out.println(a);
        System.out.println(obj2);
    }
}
