package Constructor.DeepCopyConstructor;

public class TrainTicket {

    // MAIN OBJECT FIELD
    int ticketId;
    String trainName;;
    int trainNumber;
    String travelDate;
    String boardingStation;
    String destinationStation;
    double price;
    Passenger passenger; //INNER / NESTED OBJECT
    Coach coach;         //INNER / NESTED OBJECT

    // Used to create the original(Main)Object
    TrainTicket(int ticketId, String trainName, int trainNumber, String travelDate, String boardingStation,
            String destinationStation,double price, Passenger passenger, Coach coach){
        super();
        this.ticketId=ticketId;
        this.trainName=trainName;
        this.trainNumber=trainNumber;
        this.travelDate=travelDate;
        this.boardingStation=boardingStation;
        this.destinationStation=destinationStation;
        this.price=price;

        // Assigning inner object (reference)
        this.passenger=passenger;
        this.coach=coach;

    }

 //-------------DEEP COPY CONSTRUCTOR----------------
    //This constructor copies :
    // 1. Main Object
    // 2. All inner(nested) objects
    public TrainTicket(TrainTicket oldObj) {
        super();
        // ----COPYING MAIN OBJECT DATA -------
        this.ticketId=oldObj.ticketId;
        this.trainName=oldObj.trainName;
        this.trainNumber=oldObj.trainNumber;
        this.travelDate=oldObj.travelDate;
        this.boardingStation=oldObj.boardingStation;
        this.destinationStation=oldObj.destinationStation;
        this.price=oldObj.price;

        //----- COPYING INNER/NESTED OBJECT  --------
        this.passenger= new Passenger(oldObj.passenger);
        this.coach= new Coach(oldObj.coach);
    }

    public void displayTrainTicket(){
        System.out.println("\n *****TRAIN TICKET INFO ***** ");
        System.out.println("Ticket : "+ticketId);
        System.out.println("Name : "+trainName);
        System.out.println("Train NUmber : "+trainNumber);
        System.out.println("Travel date : "+travelDate);
        System.out.println("boardingStation : "+boardingStation);
        System.out.println("destinationStation : "+destinationStation);
        System.out.println("Price : "+price);
        System.out.println("----------------------------");

        // Displaying inner object detail
        passenger.displayPassenger();
        System.out.println("----------------------------");
        coach.displayCoach();


    }
}
