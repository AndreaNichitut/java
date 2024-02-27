package isp.lab4.exercise4;
import java.util.ArrayList;
import java.util.HashMap;


public class TicketsManager {
    private HashMap<String, Event> events;
    private ArrayList<Ticket> tickets;
    public Ticket generateTicket(String eventName, String attendeeName) {
        Event event = events.get(eventName);
        Ticket ticket = event.purchaseTicket(attendeeName);
        tickets.add(ticket);
        return ticket;
    }
    public void validateTicket(int ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == ticketId) {
                if (ticket.isValid()) {
                    System.out.println("Ticket is already validated");
                    return;
                }
                ticket.validate();
                System.out.println("Ticket validated successfully");
                return;
            }
        }
        System.out.println("Ticket not found");
    }
}
