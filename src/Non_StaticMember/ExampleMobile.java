package Non_StaticMember;

/* If we want to access non-static variable from one class to another class inside a static or non-static context
*  we need to instantiate a class and access it using object reference. */
public class ExampleMobile {
    String brand;
    String model;
    double price;
    int ram;
    int storage;
}
class Example12{
   public void displayMobile(ExampleMobile obj){
       System.out.println("Mobile info");
       System.out.println("Brand : "+obj.brand);
       System.out.println("Model : "+obj.model);
       System.out.println("Price: "+obj.price);
       System.out.println("Ram : "+ obj.ram);
       System.out.println("Storage : "+obj.storage);
   }
}
class ExampleDriver{
    public static void main(String[] args){
        ExampleMobile obj = new ExampleMobile();
        obj.brand = "SAMSUNG";
        obj.model = "s23";
        obj.price = 76000;
        obj.ram = 8;
        obj.storage = 256;
        Example12 obj1 = new Example12();
        obj1.displayMobile(obj);
    }
}
