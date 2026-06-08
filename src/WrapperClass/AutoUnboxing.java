package WrapperClass;

/*
* 1. The Implicit conversion of wrapper class object into corresponding primitive type
*   known as AutoUnboxing
* 2.From java5 compiler does it implicitly using value()
* */
public class AutoUnboxing {
    public static void main(String[] args) {
        Byte a = 1;
        byte a1 = a; //Internally a.byteValue(a);
        Integer b = 123;
        int b1 = b;
        Long c = 345L;
        long c1 = c;
        Float d = 234.234f;
        float d1 = d;
        Double e = 5432.34;
        double e1 = e;
        Character f = 'a';
        char f1 = f;
        Boolean g = false;
        boolean g1 = g;

        System.out.println("Byte: "+a);
        System.out.println("byte: "+a1);
        System.out.println("Integer: "+b);
        System.out.println("int: "+b1);
        System.out.println("Long: "+c);
        System.out.println("long: "+c1);
        System.out.println("Float: "+d);
        System.out.println("float: "+d1);
        System.out.println("Double: "+e);
        System.out.println("Double: "+e1);
        System.out.println("Character: "+f);
        System.out.println("char: "+f1);
        System.out.println("Boolean: "+g);
        System.out.println("boolean: "+g1);
    }
}
