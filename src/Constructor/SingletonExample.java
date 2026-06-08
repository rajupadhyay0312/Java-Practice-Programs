package Constructor;

class Singleton{
    static private Singleton obj =null;
    private Singleton(){
        super();
    }
    public static Singleton getInstance(){
        if(obj==null){
            obj=new Singleton();
        }
        return obj;
    }
}
public class SingletonExample {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1);

        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2);


    }
}
