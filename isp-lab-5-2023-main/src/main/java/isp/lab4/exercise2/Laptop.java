package isp.lab4.exercise2;

public class Laptop implements Chargeable{
    private int batteryLevel;
    public int getBatteryLevel() {
        this.batteryLevel=batteryLevel;
        return this.batteryLevel;
    }
    public Laptop(int batteryLevel) {
        this.batteryLevel=batteryLevel;
    }
    public void charge(int durationInMinutes) {
        int sec=0;
        while(batteryLevel<100) {
            if(sec<60)
                sec=sec+30;
            else {
                durationInMinutes=durationInMinutes+1;
                sec=0;
            }
            batteryLevel++;
        }
    }
}
