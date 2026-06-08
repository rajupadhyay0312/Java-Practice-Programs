package Constructor;

public class Example1 {
    String name;
    String email;
    int yop;

    Example1(){

    }
    Example1(String name, String email, int yop){
        this.name = name;
        this.email = email;
        this.yop = yop;
    }
    public void DisplayExample(){
        System.out.println("\n *** Student info *** \n");
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("YOP : "+yop);
    }
}
class DriverExample1{
    public static void main(String[] args){
        Example1 obj = new Example1();
        obj.DisplayExample();
        Example1 obj1 = new Example1("Ramesh", "ramesh@gmail.com", 2025);
        obj1.DisplayExample();
    }
}
