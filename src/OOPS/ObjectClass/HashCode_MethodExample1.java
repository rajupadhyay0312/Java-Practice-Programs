package OOPS.ObjectClass;

class Mobile1{
    String brand;
    String model;
    Double price;

    public Mobile1(String brand, String model, Double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile1{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        return this.hashCode()==obj.hashCode();
    }
    @Override
    public int hashCode(){
        int hc = brand.hashCode()+model.hashCode()+price.hashCode();
        return hc<0?hc*=-1:hc;
    }
}
public class HashCode_MethodExample1 {
    public static void main(String[] args) {
        Mobile1 obj1 = new Mobile1("Samsung","S24",50000.0);
        Mobile1 obj2 = new Mobile1("Samsung","S24",50000.0);
        Mobile1 obj3 = new Mobile1("Samsung","S24",50000.0);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
    }
}
