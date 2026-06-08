package OOPS.ObjectClass;

class Employee{

}
class Vehicle{

}
public class GetClassExample {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.getClass());

        String str = new String("Hello");
        System.out.println(str.getClass().getName());

        Class obj = str.getClass();
        System.out.println(obj);
    }
}
