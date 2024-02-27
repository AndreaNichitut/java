package isp.lab7.safehome;

public class Door {
    private DoorStatus status;
    public void lockDoor() {
       if(status!=DoorStatus.CLOSE) {
           status=DoorStatus.CLOSE;
       }
    }
    public void unlockDoor() {
       if(status!=DoorStatus.OPEN) {
           status=DoorStatus.OPEN;
       }
    }
}
