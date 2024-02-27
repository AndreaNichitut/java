package aut.isp.lab4.exercise5;

import aut.isp.lab4.exercise3.FishFeeder;

public class AquariumController {
    private FishFeeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private int temperature;
    private int  waterLevel;

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }
    public void setFeedingTime(float feedingTime) {
        this.feedingTime=feedingTime;
    }
    public String toString() {
        return this.feeder+" "+this.manufacturer+" "+this.model+" "+this.currentTime+" "+this.feedingTime+" ";
    }
    public void checkTemperature() {
       this.temperature=temperature;
    }
    public void checkWaterLevel() {
      this.waterLevel=waterLevel;
    }
    public AquariumController(FishFeeder feeder) {
        this.feeder=feeder;
    }
}
