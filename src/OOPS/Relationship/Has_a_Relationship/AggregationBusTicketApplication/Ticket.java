package OOPS.Relationship.Has_a_Relationship.AggregationBusTicketApplication;

public class Ticket {
    private String number;
    private Bus Bus;
    private double price;

    public Ticket(String number, Bus bus, double price) {
        this.number = number;
        Bus = bus;
        this.price = price;
    }
    public void getTicket(){
        System.out.println("\n *** Ticket Detail ****");
        System.out.println("Ticket Number : "+number);
        System.out.println("Price : "+price);
    }
}
