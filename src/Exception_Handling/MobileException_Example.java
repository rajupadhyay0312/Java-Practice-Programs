package Exception_Handling;

class Mobile{
    String name;
    String model;
    double price;

    public Mobile(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
    @SuppressWarnings("removal")
    public void finalize(){
        System.out.println("mobile object got destroyed");
        int[] arr = new int[-1];
    }
}
public class MobileException_Example {
    public static void main(String[] args) {
        System.out.println("start");
        Mobile obj = new Mobile("SAMSUNG","S24",56000);
        System.out.println(obj);
        obj = null;
        System.gc();
        System.out.println("ends");
    }
}
