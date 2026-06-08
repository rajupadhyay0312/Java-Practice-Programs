package OOPS.Relationship.Has_a_Relationship.AggregationBusTicketApplication;

public class Bus {
    private static String busNumber ="MH-12-1234";
    private static String arrivalTime = "07:30 PM";
    private static String location = "Decan Pune";
    private Driver driver;
    private Manager manager;

    private final static int CAPACITY = 40;
    private int passengerIndex = 0;
    private Passenger[] passengerList = new Passenger[CAPACITY];
    private String [][] seats = new String[10][4];

    //non-static block to tag seats number in an array
    {
        char ch = 'A';
        for(int rows=0; rows<10; rows++){
            for(int column=0; column<4; column++){
                seats[rows][column] = (" "+ch+(column+1));
            }
            ch++;
        }
    }

    {
        driver = new Driver("Ramesh Kumar",9876543234L,"DL-12345678654");
    }
    public void addManager(Manager manager){
        this.manager=manager;
    }
    public Manager getManager(){
        return this.manager;
    }
    public String[][] getSeats(){
        return this.seats;
    }
    public void addPassenger(Passenger passenger, String seatNumber){
        passengerList[passengerIndex++] = passenger;
        passenger.setSeatNumber(seatNumber);
    }
    public Driver getDriver(){
        return this.driver;
    }
    public void getBusInfo(){
        System.out.println("\n BUS INFO ");
        System.out.println("Number :"+busNumber);
        System.out.println("Location : "+location);
        System.out.println("arrivalTime : "+arrivalTime);;
    }
    public Passenger[] getPassengerList(){
        return this.passengerList;
    }
}
