package aut.isp.lab4.exercise5;

public class LevelSensor {
    private float value;
    public float getValue() {
       return this.value;
    }
    public void setValue(float value) {
       this.value=value;
    }
    public LevelSensor(float value) {
        this.value=value;
    }
}
