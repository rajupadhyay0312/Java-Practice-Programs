package Constructor.This_Call;

public class ConstructorChaining {
    ConstructorChaining(){
        this(10);
        System.out.println("No argument constructor");
    }
    ConstructorChaining(int a){
        this("Hello");
        System.out.println("In argument constructor");
    }
    ConstructorChaining(String b){
        System.out.println("String argument constructor");
    }
    public static void main(String[] args) {
       new ConstructorChaining();
    }

}
