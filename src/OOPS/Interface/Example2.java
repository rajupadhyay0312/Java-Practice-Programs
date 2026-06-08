package OOPS.Interface;


//An Implementing class has to override all abstract behaviour
// of an interface for providing implementation.
interface Example{
    int add(int num1, int num2);
    int square(int num);
}
class Demo implements Example{
    @Override
    public int add(int num1, int num2){
        return num1+num2;
    }
    @Override
    public int square(int num){
        return num*num;
    }
}
public class Example2{
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.add(10,20));
        System.out.println(obj.square(4));
    }
}
