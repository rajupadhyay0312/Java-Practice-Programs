package Constructor.super_keyword;

interface Parent3{
    default public void m1(){
        System.out.println("m1() from parent3");
    }
}
interface Parent4{
    default public void m1(){
        System.out.println("m1() from parent4");
    }
}
interface Child3 extends Parent3, Parent4{
    default public void m1(){
        System.out.println("child class");
        Parent3.super.m1();
        Parent4.super.m1();
    }
}
public class MultipleInheritance implements Child3 {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.m1();
    }

}
