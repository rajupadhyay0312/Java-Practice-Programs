package OOPS.Relationship.Has_a_Relationship.AggregationBusTicketApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private Bus bus = new Bus();
    private ArrayList<Passenger> passengerList = new ArrayList<Passenger>();

    public void launch() {

        for (; ; ) {
            System.out.println("\n *** WELCOME ****");
            System.out.println("\n LAL_PARI BOOKING SYSTEM");
            System.out.println("1. Login");
            System.out.println("2. Create Account");
            System.out.println("3. Exit");
            System.out.print("Enter your option :");

            int option = new Scanner(System.in).nextInt();
            switch (option) {
                case 1 -> login();
                case 2 -> CreateAccount();
                default -> System.out.println("\n INVALID OPTION\n");
            }
        }
    }

    private void CreateAccount() {
        System.out.println("\n CREATE ACCOUNT MODULE ");
        System.out.println("1. Passenger");
        System.out.println("2. Manager");

        System.out.print("Enter a option : ");
        int opt = new Scanner(System.in).nextInt();
        switch (opt) {
            case 1 -> passengerAccountCreation();
            case 2 -> managerAccountCreation();
            default -> System.out.println("\n INVALID OPTION\n");
        }
    }

    private void passengerAccountCreation() {
        System.out.println("\n ** PASSENGER ACCOUNT CREATION MODULE ** ");
        System.out.print("Name : ");
        String name = new Scanner(System.in).next();
        System.out.print("Password : ");
        String password = new Scanner(System.in).next();
        System.out.print("contact : ");
        long contact = new Scanner(System.in).nextLong();
        System.out.print("email : ");
        String email = new Scanner(System.in).next();
        System.out.print("Gender : ");
        String gender = new Scanner(System.in).next();
        System.out.print("Age : ");
        int age = new Scanner(System.in).nextInt();

        Passenger passenger = new Passenger(name, password, contact, email, gender, age);
        for (Passenger ele : passengerList) {
            if (ele.getContact() == contact) {
                System.out.println("\n Passenger Account already Exit \n");
                break;
            }
        }
        System.out.println("\n CREATED SUCCESSFULLY");
        passengerList.add(passenger);

    }

    public void managerAccountCreation() {
         if(bus.getManager()!=null){
             System.out.println("\n MANAGER ACCOUNT ALREADY EXIT \n");
             return;
         }
        System.out.println("\n MANAGER ACCOUNT CREATION MODULE");
        System.out.print("Name : ");
        String name = new Scanner(System.in).next();
        System.out.print("Contact :");
        long contact = new Scanner(System.in).nextLong();
        System.out.print("Password : ");
        String password = new Scanner(System.in).next();

        Manager manager = new Manager(name, contact, password);
        bus.addManager(manager);


    }
    public void login() {
        System.out.println("\n *** LOGIN MODULE *** ");
        System.out.print("Contact :");
        long contact = new Scanner(System.in).nextLong();
        System.out.print("Password :");
        String password = new Scanner(System.in).next();

        if (bus.getManager() != null) {
            if (contact == bus.getManager().getContact() && password.equals(bus.getManager().getPassword())) {
                managerHome();
            }
        }
        for (Passenger ele : passengerList) {
            if (ele.getContact() == contact && ele.getPassword().equals(password)) {
                homePassenger(ele);
                break;
            }
        }
        System.out.println("\n INVALID CREDENTIAL");
    }

    public void managerHome() {
        for (; ; ) {

            System.out.println("\n ** MANAGER HOME PAGE ** ");
            System.out.println("1.View All Ticker");
            System.out.println("2.Exit");
            System.out.print("Enter your option : ");
            int option = new Scanner(System.in).nextInt();
            switch (option) {
                case 1 -> viewAllTicket();
                case 2 -> exit();
                default -> System.out.println("\n ** INVALID OPTION\n");
            }
        }
    }

    private void viewAllTicket() {
        System.out.println("\n ** VIEW All Ticket ");
        for(Passenger ele : passengerList){
            if(ele == null) return;
            ele.getPassengerInfo();
            System.out.println("------------------------");
        }
    }
    public void exit(){
        launch();
    }
    public void homePassenger(Passenger passenger){
        for(;;){
            System.out.println("\n ** PASSENGER HOME PAGE ** ");
            System.out.println("1. Book Seat");
            System.out.println("2. View Ticket");
            System.out.println("3. Cancel Tickets");
            System.out.println("4. History");
            System.out.println("5. Exit");
            System.out.print("Enter your option :");
            int option = new Scanner(System.in).nextInt();
            switch(option){
                case 1 -> bookSeat(passenger);
                case 2 -> viewTicket(passenger);
                case 3 -> cancelTicket();
                case 4 -> history();
                case 5 -> exit();
                default -> System.out.println("\n INVALID OPTION ");
            }
        }
    }
    public void bookSeat(Passenger passenger){
        System.out.println("\n SEAT BOOKING MODULE \n");
        viewSeat();
        System.out.print("Enter your seatNumber : ");
        String seatNumber = new Scanner(System.in).next();

        boolean flag = checkSeatAvail(seatNumber);

        if(flag){
            System.out.println("\n YOUR SEAT IS CONFIRMED ");
            bus.addPassenger(passenger,seatNumber);
        }else{
            System.out.println("\n SEAT IS ALREADY BOOKED/INVALID");
        }
    }
    public boolean checkSeatAvail(String seatNumber) {
        String[][] seats = bus.getSeats();
        int i = 0;
        for (String[] rows : seats) {
          int j =0;
          for(String seat : rows){
              if(seat.equals(seatNumber)){
                  seats[i][j] = " - ";
                  return true;
              }
              j++;
          }
          i++;
        }
        return false;
    }
    public void viewSeat(){
        System.out.println("\n **** SEATS ****");
        String[][] seats = bus.getSeats();
        for(int i=0; i<10; i++){
            int cnt = 1;
            System.out.println(" ");
            for(int j=0; j<4; j++){
                System.out.print(seats[i][j]+"  ");
                if(cnt == 2)
                    System.out.print(" ");
                cnt++;
            }
            System.out.println();
        }
    }
    public void viewTicket(Passenger passenger){
        System.out.println("\n ** VIEW TICKET \n");
        bus.getBusInfo();
        bus.getDriver().getDriverInfo();
        bus.getManager().getManagerInfo();
        System.out.println("Ticket Price :"+passenger.getTicketPrice());
    }
    public void cancelTicket(){
        System.out.println("\n ** CANCEL TICKET **");
    }
    public void history(){
        System.out.println("\n HISTORY ");
    }
}




