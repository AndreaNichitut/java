package aut.isp.lab4.exercise6;

public abstract class Sensor {
    private String manufacturer;
    private String model;

    private LevelSensor levelSensor;
    private TemperatureSensor temperatureSensor;

    public Sensor()
    {
        this.manufacturer=manufacturer;
        this.model=model;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", levelSensor=" + levelSensor +
                ", temperatureSensor=" + temperatureSensor +
                '}';
    }
}
