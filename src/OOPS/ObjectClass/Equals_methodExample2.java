package OOPS.ObjectClass;

class Mobile{
    String brand;
    String model;
    double price;

    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public boolean equals(Object obj){
       Mobile obj2 = (Mobile)obj;
       if(this.brand.equals(obj2.brand)&&this.model.equals(obj2.model)&&this.price==obj2.price){
           return true;
       }
        return false;
    }
}
public class Equals_methodExample2 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile("SAMSUNG","S23",60000);
        System.out.println(obj1);

        Mobile obj2 = new Mobile("SAMSUNG","S23",60000);
        System.out.println(obj2);
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }
}
