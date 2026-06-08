package Constructor;

// This is the example of shallow copy....
class Marker{
    String brand;
    String type;
    String color;
    double price;

    Marker(String brand, String type,String color, double price){
        super();
        this.brand=brand;
        this.type=type;
        this.color=color;
        this.price=price;
    }
    Marker(Marker oldObj){
        this.brand = oldObj.brand;
        this.type = oldObj.type;
        this.color=oldObj.color;
        this.price= oldObj.price;
    }
    public void displayMarker(){
        System.out.println("------- MARKER INFO -------");
        System.out.println("Brand : "+brand);
        System.out.println("Type : "+type);
        System.out.println("color : "+color);
        System.out.println("Price : "+price+"\n------------------------------");
    }
}
public class DriverExampleCopyConstructor {
    public static void main(String[] args){
       Marker oldObj = new Marker("CAMLIN","White Board Marker","Black",20);
       oldObj.displayMarker();

       Marker copyObj = new Marker(oldObj);
       copyObj.displayMarker();

    }
}
