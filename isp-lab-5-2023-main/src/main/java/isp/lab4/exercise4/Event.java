package isp.lab4.exercise4;
import java.util.ArrayList;

public class Event {
    private String name;
    private String date;
    private int totalTickets;
    private int availableTickets;
    private ArrayList<Ticket> tickets;

    public Event(String name, String date, int totalTickets) {
        this.name = name;
        this.date = date;
        this.totalTickets = totalTickets;
        this.availableTickets = totalTickets;
        this.tickets = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public int getTotalTickets() {
        return totalTickets;
    }
    public int getAvailableTickets() {
        return availableTickets;
    }
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
    public Ticket purchaseTicket(String attendeeName) {
        if (availableTickets == 0) {
            return null;
        }
        int id = tickets.size() + 1;
        Ticket ticket = new Ticket(id, name, attendeeName);
        tickets.add(ticket);
        availableTickets--;
        return ticket;
    }
    public Ticket getTicketById(int ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == ticketId) {
                return ticket;
            }
        }
        return null;
    }
    public boolean isCheckedIn(int ticketId) {
        Ticket ticket = getTicketById(ticketId);
        if (ticket == null) {
            return false;
        }
        return ticket.isCheckedIn();
    }
    public void checkInTicket(int ticketId) {
        Ticket ticket = getTicketById(ticketId);
        if (ticket == null) {
            return;
        }
        ticket.checkIn();
    }
}
