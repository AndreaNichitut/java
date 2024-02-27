package isp.lab10.exercise1;

public class Aircraft extends Runnable {
    private String id;
    private int altitude;

    public String getId() {
        return id;
    }

    public int getAltitude() {
        return altitude;
    }

    public Aircraft(String id, int altitude) {
        this.id = id;
        this.altitude = altitude;
    }

}
