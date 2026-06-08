package OOPS;

class Ramesh{}
class Suresh extends Ramesh{}
class Ganesh extends Suresh{}
class Mahesh extends Ramesh{}
public class Example_instanceof {
    public static void main(String[] args) {
//        Ramesh obj = new Suresh();
        
//        System.out.println(obj instanceof Ganesh);
//        System.out.println(obj instanceof Ramesh);

//        Object obj = new StringBuffer();
//        System.out.println(obj instanceof String);

//        String str = new String();
//        System.out.println(str instanceof StringBuffer);//Inconvertible types; cannot cast 'java.lang.String' to 'java.lang.StringBuffer'

//        Mahesh obj = new Mahesh();
//        System.out.println(obj instanceof Mahesh);
//        System.out.println(obj instanceof Ramesh);
//        System.out.println(obj instanceof Ganesh);//Inconvertible types; cannot cast 'OOPS.Mahesh' to 'OOPS.Ganesh'

        Object obj = new String();
        System.out.println(obj instanceof String);
        System.out.println(obj instanceof Object);
    }
}
