package aut.isp.lab4.exercise3;

public class AquariumController {
    private FishFeeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }
    public void setFeedingTime(float feedingTime) {
        this.feedingTime=feedingTime;
    }
    public String toString() {
        return this.feeder+" "+this.manufacturer+" "+this.model+" "+this.currentTime+" "+this.feedingTime+" ";
    }
    public AquariumController(FishFeeder feeder,String manufacturer, String model, float currentTime, float feedingTime) {
        this.feeder=feeder;
        this.manufacturer=manufacturer;
        this.model=model;
        this.currentTime=currentTime;
        this.feedingTime=feedingTime;
    }
}
