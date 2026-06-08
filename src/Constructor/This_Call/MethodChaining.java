package Constructor.This_Call;

public class MethodChaining {
    String str;
    MethodChaining(String str){
        this.str=str;
    }
    public String toString(){
        return str;
    }
    public MethodChaining toUppercase(){
        str = str.toUpperCase();
        return this;
    }
    public MethodChaining toLowercase() {
        str = str.toLowerCase();
        return this;
    }
}
class MethodChainingExample{
    public static void main(String[] args) {
       // String str =new String("Hello Java");
        //str=str.toUpperCase().toLowerCase();
       // System.out.println(str);

        MethodChaining str1 = new MethodChaining("Hello MethodChaining");
        System.out.println(str1);
        str1.toUppercase().toLowercase();
        System.out.println(str1);
    }
}
