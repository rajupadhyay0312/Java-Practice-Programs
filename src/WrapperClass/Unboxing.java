package WrapperClass;

/*
* 1.Explicit process of converting a wrapper object into it's corresponding
*   primitive type is known as Unboxing...
* 2.Before java 5 there was only one way to get primitive back from wrapper object
*   i.e; by using method...
* Syntax:
*        referenceVar.primitiveValue();
* */
public class Unboxing {
    public static void main(String[] args) {
        int a = 234;
        System.out.println(a);
        Integer obj1 = Integer.valueOf(a); // Boxing
        System.out.println(obj1);
        int b = obj1.intValue(); // Unboxing
        System.out.println(b);

        char c = 'A';
        System.out.println(c);
        Character obj2 = Character.valueOf(c); //Boxing
        System.out.println(obj2);
        char d = obj2.charValue();
        System.out.println(d);

        boolean e = true;
        System.out.println(e);
        Boolean obj3 = Boolean.valueOf(e);
        System.out.println(obj3);
        boolean f = obj3.booleanValue();
        System.out.println(f);

    }
}
