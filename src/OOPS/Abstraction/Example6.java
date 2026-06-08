package OOPS.Abstraction;

abstract class Demo1{
    private int square(int num){
        return num*num;
    }
    public final int squareNum(int num){
        return square(num);
    }
}
class Example extends Demo1{}
public class Example6 {
    public static void main(String[] args) {
        Demo1 obj = new  Example();
        System.out.println(obj.squareNum(10));
    }
}
//que:- Can we declare private method inside an abstract class :-
// Explanation:-
// 1. Yes, we can define private method inside an abstract class.
// 2. As a private method is not inherited from one class to another
// so we can specify some implementation which will be object specific.
// 3. It can be called inside another non-static member of same class.
// 4. so we cannot instantiate abstract class the private which is defined
// in it must be used inside the same class.
