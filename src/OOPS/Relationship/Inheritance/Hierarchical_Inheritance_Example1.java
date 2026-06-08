package OOPS.Relationship.Inheritance;


class Product {
    String name;
    String type;
    String desc;
    double price;

    public Product(String name, String type, String desc, double price) {
        this.name = name;
        this.type = type;
        this.desc = desc;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("\nPRODUCT [Name = " + name + ", Type = " + type + ", desc = " + desc + ", price =" + price + "]");
    }
}

class Order extends Product {
    String orderId;
    int quantity;
    double totalPrice;
    double discount;

    public Order(String name, String type, String desc, double price, String orderId, int quantity, double discount) {
        super(name, type, desc, price);
        this.orderId = orderId;
        this.quantity = quantity;
        this.totalPrice = (price*quantity)-((price*quantity)/100*discount);
        this.discount = discount;
    }
    public void displayOrder() {
        System.out.println("ORDER [orderId='" + orderId + ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", discount=" + discount + "]");
    }
}
class OnlineOrder extends Order {
    String address;
    long contact;
    String deliveryDate;
    String invoice;
    int rewardPoints = (int)(totalPrice/100);

    public OnlineOrder(String name, String type, String desc, double price, String orderId, int quantity, double totalPrice,
                       double discount, String address, long contact, String deliveryDate, String invoice) {
        super(name, type, desc, price, orderId, quantity,discount);
        this.address = address;
        this.contact = contact;
        this.deliveryDate = deliveryDate;
        this.invoice = invoice;
    }

    public void displayOnlineOrder() {
        System.out.println("ONLINE_ORDER [address='" + address + ", contact=" + contact + ", deliveryDate='" + deliveryDate + ", invoice='" + invoice + ", rewardPoints = "+rewardPoints+"]");
    }
}

class StoreOrder extends Order {
    String storeId;
    String billNo;
    int counter;
    String dateTime;

    public StoreOrder(String name, String type, String desc, double price, String orderId, int quantity, double discount, String storeId, String billNo, int counter, String dateTime) {
        super(name, type, desc, price, orderId, quantity, discount);
        this.storeId = storeId;
        this.billNo = billNo;
        this.counter = counter;
        this.dateTime = dateTime;
    }

    public void displayStoreOrder() {
        System.out.println("STORE_ORDER[ address='" + storeId + ", billNo='" + billNo +", counter=" + counter +", dateTime='" + dateTime+ "]");
    }
}

public class Hierarchical_Inheritance_Example1 {
    public static void main(String[] args) {
        OnlineOrder onlineOrder = new OnlineOrder("Marker","Stationary","Camlin White Board Marker",35,"PRO123",
                10,10,12,"JM road Deccan",789654321L,"25/12/25","invoice");
        onlineOrder.displayProduct();
        onlineOrder.displayOrder();
        onlineOrder.displayOnlineOrder();

        System.out.println("\n------------------------------");

        StoreOrder storeOrder = new StoreOrder("SmartPhone","Electronic","Iphone 16",70000,"ELEL24432",1,20,"VIJAYSALE123","V32123",1,"12/23/25, 8:30pm");
        storeOrder.displayProduct();
        storeOrder.displayOrder();
        storeOrder.displayStoreOrder();

    }
}
