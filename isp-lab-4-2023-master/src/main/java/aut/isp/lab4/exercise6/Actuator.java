package aut.isp.lab4.exercise6;

public abstract class Actuator {
    private String manufacturer;
    private String model;
    private Heater heater;
    private Alarm alarm;
    public Actuator()
    {
        this.manufacturer="RoActuator";
        this.model="KNX";
    }
    public abstract void turnOn();

    public abstract  void turnOff();
    public String toString()
    {
        return "Manufacturer: " + manufacturer + " Model: " + model;
    }
}
