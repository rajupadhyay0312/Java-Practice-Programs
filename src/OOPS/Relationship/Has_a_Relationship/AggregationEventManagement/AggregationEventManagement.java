package OOPS.Relationship.Has_a_Relationship.AggregationEventManagement;

import java.util.ArrayList;

class Attendees {
    private String name;
    private String contact;
    private String email;
    private String ticketType;

    public Attendees(String name, String contact, String email, String ticketType) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.ticketType = ticketType;
    }

    public void getAttendeesInfo() {
        System.out.println("ATTENDEES [name = " + name + ", contact = " + contact + ", email = " + email + ", ticketType =" + ticketType + "]");
    }
}

class Organizer {
    private String name;
    private long contact;
    private int experience;
    private String company;

    Organizer(String name, long contact, int experience, String company) {
        this.name = name;
        this.contact = contact;
        this.experience = experience;
        this.company = company;
    }

    public void getOrganizerDetails() {
        System.out.println("ORGANIZER [name = " + name + ", contact = " + contact + ", experience = " + experience + " Years" + ", company =" + company + "]");
    }
}

class Venue {
    private String venuName;
    private String location;
    private int capacity;
    private boolean available;

    public Venue(String venuName, String location, int capacity, boolean available) {
        this.venuName = venuName;
        this.location = location;
        this.capacity = capacity;
        this.available = available;
    }

    public void getVenueInfo() {
        System.out.println("VENUE [venuName = " + venuName + ", location = " + location + ", capacity = " + capacity + ", available =" + (available ? " Yes" : " No") + "]");
    }
}

class Event {
    private String eventName;
    private String eventDate;
    private String eventType;
    private Organizer organizer;
    private Venue venue;
    private ArrayList<Attendees> attendeesList;

    public Event(String eventName, String eventDate, String eventType) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventType = eventType;

        attendeesList = new ArrayList<>();
    }

    public void getEventInfo() {
        System.out.println("\n ***** EVENT INFO ***** ");
        System.out.println("Event Name : " + eventName);
        System.out.println("Event Date : " + eventDate);
        System.out.println("Event Type : " + eventType);
    }

    public void addOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Organizer getOrganizer() {
        return this.organizer;
    }

    public void addVenu(Venue venue) {
        this.venue = venue;
    }

    public Venue getVenue() {
        return this.venue;
    }

    // Add ONE attendee at a time
    public void addAttendee(Attendees attendee) {
        attendeesList.add(attendee);
    }


    public void showAllAttendees() {
        System.out.println("\n***** ATTENDEES LIST *****");

        for (Attendees attendee : attendeesList) {
            attendee.getAttendeesInfo();
        }
    }
}

public class AggregationEventManagement {
    public static void main(String[] args) {
        Event event = new Event("LA HULA DANCE", "12/12/2025", "MASTI MAI JHUM JAO \n");
        event.getEventInfo();

        Organizer organizer = new Organizer("Suresh", 1234566788L, 5, "TUFAN ");
        event.addOrganizer(organizer);
        event.getOrganizer().getOrganizerDetails();

        Venue venue = new Venue("DUBAI DANCING CLUB ", "Nagpur", 50, true);
        event.addVenu(venue);
        event.getVenue().getVenueInfo();

        Attendees al = new Attendees("Ramesh", "9876543210", "ramesh@gmail.com", "VIP");
        Attendees a2 = new Attendees("Mahesh", "9876883210", "mahesh@gmail.com", "Regular");
        event.addAttendee(al);
        event.addAttendee(a2);

        event.showAllAttendees();
    }
}
