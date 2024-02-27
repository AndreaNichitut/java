package aut.isp.lab4.exercise1;

import javax.management.monitor.StringMonitor;

public class AquariumController {

    //attributs
    private String manufacturer;
    private String model;
    private float currentTime;

    //constructors
    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        System.out.println(this.currentTime);
    }
    @Override
    public String toString() {
        return this.manufacturer+" "+this.model+" "+this.currentTime+" ";
    }

    //methods
    AquariumController(String model, float currentTime, String manufacturer) {
        this.model=model;
        this.currentTime=currentTime;
        this.manufacturer=manufacturer;
    }
}
