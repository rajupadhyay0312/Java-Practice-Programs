package Non_StaticMember;

/* we can access a global variable using this keyword if we have a local variable with same name as global variable*/
public class Example6 {
    int a = 123;
    public static void main(String[] args){
        System.out.println("main()");
        Example6  obj = new Example6();
        System.out.println(obj);
       obj.m1();
    }
    public void m1(){
        System.out.println("m1()");
        int a = 456;
        System.out.println(a);
        System.out.println(this.a);
    }
}
