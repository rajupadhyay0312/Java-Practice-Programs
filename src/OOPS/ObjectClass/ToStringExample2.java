package OOPS.ObjectClass;

class Marker{
    String brand;
    String color;
    int price;

    public Marker(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
public class ToStringExample2 {
    public static void main(String[] args) {
        Marker obj1 = new Marker("Doms","Black",25);
        System.out.println(obj1);
    }
}
