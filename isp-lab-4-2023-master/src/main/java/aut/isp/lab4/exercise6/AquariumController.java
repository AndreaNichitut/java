package aut.isp.lab4.exercise6;

public class AquariumController {
    private FishFeeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private Actuator actuator1=new Heater();
    private Actuator actuator2=new Alarm();
    private Actuator actuator3=new pHAlarm();
    private TemperatureSensor sensor1=new TemperatureSensor();
    private LevelSensor sensor2=new LevelSensor();
    private pHSensor sensor3=new pHSensor();
    private int temperature;


    public AquariumController(FishFeeder feeder)
    {
        this.currentTime=12;
        this.feeder=feeder;
        this.model="model";
        this.feedingTime=12;
        this.manufacturer="manufacturer";
        this.temperature=13;
        this.actuator1=actuator1;
        this.actuator2=actuator2;
        this.actuator3=actuator3;



    }

    public float setCurrentTime(float currentTime)
    {
        return this.currentTime=currentTime;
    }
    public float setFeedingTime(float feedingTime)
    {
        this.feedingTime=feedingTime;
        if (this.currentTime==feedingTime )
        {
            System.out.println("It's feeding time");
            feeder.fillUp();
            feeder.feed();
        }
        else
            System.out.println("It's not feeding time yet");
        return 1;
    }

    public void checkTemperature()
    {
        sensor1.setValue(26) ;
        if (sensor1.getValue()<24)
            actuator1.turnOn();
        else if (sensor1.getValue()==24)
        {
            actuator1.turnOff();
        }
        if (sensor1.getValue()>27)
            actuator1.turnOn();
        else
            actuator1.turnOff();
    }
    public void checkWaterLevel()
    {
        sensor2.setValue(12);
        if (sensor2.getValue()<10)
            actuator2.turnOn();
        else
            actuator2.turnOff();
    }
    @Override
    public String toString() {
        return "AquariumController{" +
                "feeder=" + feeder +
                ", currentTime=" + currentTime +
                ", feedingTime=" + feedingTime +
                '}';
    }
    public void pHMonitoring(float pHlevelLow, float pHlevelHigh,float pHModificat)
    {
        sensor3.setValue(7.1F);
        int h=0;
        int l=0;
        if ((sensor3.getValue()-pHModificat)>pHlevelLow)
        {
            l++;
            actuator3.turnOff();
            System.out.println("New pH is: " + (sensor3.getValue()-pHModificat));
        }
        if ((sensor3.getValue()+pHModificat)<pHlevelHigh)
        {
            h++;
            actuator3.turnOff();
            System.out.println("New pH is: " + (sensor3.getValue()+pHModificat));
        }
        if (h==0 && l==0)
            actuator3.turnOn();

    }
}
