package Exception_Handling.ThrowableClass;

public class ThrowExample5 {
    public static void main(String[] args) {
        System.out.println("start");
        Object obj = new String("String");
        try{
            StringBuffer sb = checkCastObject(obj);
        }catch(ClassCastException e){
            System.out.println("CCE HANDLED");
            System.out.println(e.getMessage());
        }
        System.out.println("ends");
    }
    public static StringBuffer checkCastObject(Object obj){
        if(obj instanceof StringBuffer)
            return (StringBuffer) obj;

        throw new ClassCastException("Underlying obj is not a StringBuffer type");
    }
}
