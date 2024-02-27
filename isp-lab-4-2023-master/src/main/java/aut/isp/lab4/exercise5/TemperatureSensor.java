package aut.isp.lab4.exercise5;

public class TemperatureSensor {
    private int value;
    public int getValue() {
        return this.value;
    }
    public void setValue(int value) {
        this.value=value;
    }
    public TemperatureSensor(int value) {
        this.value=value;
    }
}
