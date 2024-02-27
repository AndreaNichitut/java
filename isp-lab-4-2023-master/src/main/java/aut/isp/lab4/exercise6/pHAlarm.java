package aut.isp.lab4.exercise6;

public class pHAlarm extends Actuator {
    public void turnOn()
    {
        System.out.println("the ph cannot be changed");
    }
    public void turnOff()
    {
        System.out.println("pH can be changed");
    }
}
