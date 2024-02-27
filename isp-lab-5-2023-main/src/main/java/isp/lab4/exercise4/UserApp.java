package isp.lab4.exercise4;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class UserApp {
    private HashMap<String, Event> events;
    private ArrayList<Ticket> tickets;

    public void buyTicket(String eventName, String attendeeName) {
        Event event = events.get(eventName);
        Ticket ticket = event.purchaseTicket(attendeeName);
        tickets.add(ticket);
    }
    public void viewTicket(int ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == ticketId) {
                System.out.println("Ticket ID: " + ticket.getId());
                System.out.println("Event name: " + ticket.getEventName());
                System.out.println("Attendee name: " + ticket.getAttendeeName());
                return;
            }
        }
    }
}
