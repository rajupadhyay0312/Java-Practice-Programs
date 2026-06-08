package WrapperClass;

/*
* 1.The Implicit(Automatically) process of converting primitive
*   type to it's corresponding wrapper class object...
* 2.From java 5 the auto boxing is done by the compiler implicitly.
* 3.Internally compiler uses factory method i.e; DataType.valueOf(argument).
* */

/// Example:-
public class AutoBoxing {
    public static void main(String[] args) {
        byte a = 1;
        int b = 123;
        long c = 345L;
        float d = 234.234f;
        double e = 5432.234;
        char f = 'a';
        boolean g = false;

        Byte a1 = a;     // Internally Byte.valueOf(a)
        Integer b1 = b;  // Internally Integer.valueOf(b)
        Long c1 = c;     // Internally Long.valueOf(v)
        Float d1 = d;    // Internally Float.valueOf(d)
        Double e1 = e;   // Internally Double.valueOf(e)
        Character f1 = f;// Internally Character.valueOf(f)
        Boolean g1 = g;  // Internally Boolean.valueOf(g)

        System.out.println("byte: "+a);
        System.out.println("Byte: "+a1);
        System.out.println("int: "+b);
        System.out.println("Integer: "+b1);
        System.out.println("long: "+c);
        System.out.println("Long: "+c1);
        System.out.println("float: "+d);
        System.out.println("Float: "+d1);
        System.out.println("double: "+e);
        System.out.println("Double: "+e1);
        System.out.println("char: "+f);
        System.out.println("Character: "+f1);
        System.out.println("boolean: "+g);
        System.out.println("Boolean: "+g1);
    }
}
