package OOPS.Polymorphism.Method_Overriding;


class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat Meows");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
