package Constructor.DeepCopyConstructor;

public class Coach {
    String coachType; //sleeper/AC
    String coachNumber; //s1/m1/b1
    int seatNumber; //2/8/3/4

    Coach(String coachType, String coachNumber, int seatNumber){
        super();
        this.coachType=coachType;
        this.coachNumber=coachNumber;
        this.seatNumber=seatNumber;
    }

    public Coach(Coach oldCoach) {
        super();
        this.coachType=oldCoach.coachType;
        this.coachNumber=oldCoach.coachNumber;
        this.seatNumber=oldCoach.seatNumber;
    }

    public void displayCoach(){
        System.out.println("\n ***** COACH INFO ****** ");
        System.out.println("CoachType : "+coachType);
        System.out.println("CoachNumber : "+coachNumber);
        System.out.println("Seat Number : "+seatNumber);

    }
}
