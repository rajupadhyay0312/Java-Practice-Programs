package WrapperClass;

public class ParseInt_Example {
    public static void main(String[] args) {
        Integer a = 123;
        Boolean b = true;

        String a1 = a.toString();
        String b1 = b.toString();
        System.out.println(a1);
        System.out.println(b1);

        Integer a2 = Integer.parseInt(a1);
        Boolean b2 = Boolean.parseBoolean(b1);
        System.out.println(a2);
        System.out.println(b2);
    }
}
