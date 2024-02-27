package aut.isp.lab4.exercise4;

import aut.isp.lab4.exercise3.FishFeeder;

public class AquariumController {
    private FishFeeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private boolean lights;

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }
    public void setFeedingTime(float feedingTime) {
        this.feedingTime=feedingTime;
    }
    public String toString() {
        return this.feeder+" "+this.manufacturer+" "+this.model+" "+this.currentTime+" "+this.feedingTime+" ";
    }
    public void powerLights() {
        lights=true;
    }
    public void stopLights() {
        lights=false;
    }
    public void controlLights(float currentTime) {
        if(this.currentTime>10 && this.currentTime<16) {
            powerLights();
            System.out.println("Lights on");
        }
        else {
            stopLights();
            System.out.println("Lights off");
        }
    }
    public AquariumController(FishFeeder feeder, String manufacturer, String model, float currentTime, float feedingTime, boolean lights) {
        this.feeder=feeder;
        this.manufacturer=manufacturer;
        this.model=model;
        this.currentTime=currentTime;
        this.feedingTime=feedingTime;
        this.lights= lights;
    }
}
