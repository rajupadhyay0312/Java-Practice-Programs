package Constructor.DeepCopyConstructor;

public class DriverExampleRailway {
    public static void main(String[] args){
        Address passAdd = new Address("ManikGarh", "Chnadrapur",442908);
        Passenger passenger = new Passenger("Suresh","suresh@gmail.com",22,7083305467L,496686608221L,passAdd);

        Coach coach =new Coach("First AC","H1",5);

        TrainTicket oldObj = new TrainTicket(123456,"Ganga Kaveri",111987,"27/11/2025",
                "BPQ","Ballia",5000,passenger,coach);
        oldObj.displayTrainTicket();

        System.out.println("\n______________Copy Object______________");
        TrainTicket copyObj = new TrainTicket(oldObj);
        copyObj.displayTrainTicket();

        System.out.println("________________ AFTER CHANGE IN COPY _______________");
        copyObj.coach.seatNumber = 8;
        copyObj.coach.coachType = "Sleeper";
        copyObj.coach.displayCoach();

        System.out.println("\n___________ORIGINAL OBJECT___________");
        oldObj.coach.displayCoach();
        oldObj.boardingStation= "Chandra";
        oldObj.price=10000;
        oldObj.travelDate= "28/11/25";
        oldObj.displayTrainTicket();

        System.out.println("\n___________OLD OBJ PRICE CHANGE_________");
        oldObj.displayTrainTicket();
        copyObj.displayTrainTicket();

    }
}