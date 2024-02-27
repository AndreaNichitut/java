package isp.lab4.exercise4;

public class Ticket {
    private int id;
    private String eventName;
    private String attendeeName;
    private boolean checkedIn;
    private boolean valid;

    public Ticket(int id, String eventName, String attendeeName) {
        this.id = id;
        this.eventName = eventName;
        this.attendeeName = attendeeName;
        this.checkedIn = false;
        this.valid = false;
    }
    public int getId() {
        return id;
    }
    public String getEventName() {
        return eventName;
    }
    public String getAttendeeName() {
        return attendeeName;
    }
    public boolean isCheckedIn() {
        return checkedIn;
    }
    public boolean isValid() {
        return valid;
    }
    public void validate() {
        valid = true;
    }
    public void checkIn() {
        checkedIn = true;
    }
}
