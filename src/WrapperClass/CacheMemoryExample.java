package WrapperClass;

public class CacheMemoryExample {
    public static void main(String[] args) {
        Integer a = 12;
        Integer b = 12;
        System.out.println(a==b);

        Byte c = 127;
        Byte d = 127;
        System.out.println(c==d);

        Float e = 12.12f;
        Float f = 12.12f;
        System.out.println(e==f);

        Integer g = 1200;
        Integer h = 1200;
        System.out.println(g==h);
    }
}
