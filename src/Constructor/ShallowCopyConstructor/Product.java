package Constructor.ShallowCopyConstructor;

public class Product {

    // ---MAIN OBJECT FIELD ---
    int productId;
    String name;
    String brand;
    String manufacturing;
    double price;
    Customer customer;
    Supplier supplier;
    Delivery delivery;

    // Used to create the original(Main)Object
    public Product(int productId, String name, String brand, String manufacturing,
                   double price, Customer customer, Supplier supplier, Delivery delivery){

        super();
        this.productId =productId;
        this.name=name;
        this.brand=brand;
        this.manufacturing=manufacturing;
        this.price=price;
        this.customer = customer;
        this.supplier=supplier;
        this.delivery=delivery;
    }

    // ------- Copy the Main object -----
    public Product(Product oldProduct){
        super();
        this.productId =oldProduct.productId;// copy data
        this.name=oldProduct.name;// copy data
        this.brand=oldProduct.brand;// copy data
        this.manufacturing=oldProduct.manufacturing;// copy data
        this.price=oldProduct.price;// copy data

        //---- SIMPLE OBJECT WITHOUT NESTED OBJECT -----
        this.customer = oldProduct.customer; //ref copy
        this.supplier=oldProduct.supplier; //ref copy
        this.delivery=oldProduct.delivery;//ref copy
    }
    public void displayProduct(){
        System.out.println("\n****** PRODUCT INFO ********");
        System.out.println("ProductId : "+productId);
        System.out.println("Name : "+name);
        System.out.println("Brand : "+brand);
        System.out.println("Manufacturing : "+manufacturing);
        System.out.println("price : "+price);
        System.out.println("_____________________________");
        customer.displayCustomer();
        System.out.println("_____________________________");
        supplier.displaySupplier();
        System.out.println("_____________________________");
        delivery.displayDelivery();
    }
}
