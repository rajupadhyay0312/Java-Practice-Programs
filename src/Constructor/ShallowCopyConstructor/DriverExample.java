package Constructor.ShallowCopyConstructor;

public class DriverExample {
    public static void main(String[] args){
      Address custAdd = new Address("Deccan","Pune",411004);
      Customer customer = new Customer("Ramesh Kumar","ramesh@gmail.com",
                                        8976543215L,custAdd);

      Address supAdd = new Address("Karol bagh","Delhi",400001);
      Supplier supplier = new Supplier("ABC Enterprises","abcenterprises@gmail.com",
                                        7635498721L,supAdd);

      Delivery delivery = new Delivery("Blue Dart",6785432190L,"bluedart@gmail.com",
                                       "21/11/2025", "27/11/2025");


      Product oldProduct = new Product(12345,"Marker","Camlin","Camlin MANUF",
                                        20, customer,supplier,delivery);
      System.out.println("\n------------ OLD OBJECT -----------");
      oldProduct.displayProduct();

      System.out.println("\n------------ COPY OBJECT -----------\n");
      Product copyObj = new Product(oldProduct);
      copyObj.displayProduct();

      System.out.println("\n------- AFTER CHANGE IN COPY --------");
      copyObj.customer.name="NOT SPECIFIED";
      copyObj.customer.displayCustomer();

      System.out.println("\n---------- ORIGINAL OBJECT ----------");
      oldProduct.customer.displayCustomer();
      oldProduct.brand = "DOMS";
      oldProduct.price=30;
      oldProduct.delivery.name="Ekart";
      System.out.println("\n------------ OLD OBJECT BRAND CHANGE -------------");
      oldProduct.displayProduct();

      System.out.println("\n------------ COPY OBJECT NOT CHANGE -------------");
      copyObj.displayProduct();
    }

}
