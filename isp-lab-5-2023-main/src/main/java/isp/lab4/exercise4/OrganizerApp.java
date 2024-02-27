package isp.lab4.exercise4;

import java.util.ArrayList;
import java.util.HashMap;

public class OrganizerApp {
    private HashMap<String, Event> events;
    private ArrayList<Ticket> tickets;
    public void checkIn(String eventName, int ticketId) {
        Event event = events.get(eventName);
        if (event == null) {
            System.out.println("Event not found");
            return;
        }
        Ticket ticket = event.getTicketById(ticketId);
        if (ticket == null) {
            System.out.println("Ticket not found");
            return;
        }
        if (!ticket.isValid()) {
            System.out.println("Ticket has not been validated");
            return;
        }
        if (event.isCheckedIn(ticketId)) {
            System.out.println("Ticket has already been checked in");
            return;
        }
        event.checkInTicket(ticketId);
        System.out.println("Ticket checked in successfully");
    }
}
