package isp.lab4.exercise3;
import java.util.ArrayList;
import java.util.List;

public class MonitoringService {
    private List<Double> temperatureSensors= new ArrayList<>();
    private List<Double> allSensors= new ArrayList<>();

    public double getAvarageTemperatureSensors() {
     double s=0;
     for(double temperature : temperatureSensors) {
         s=s+temperature;
     }
     return s/temperatureSensors.size();
    }
    public double getAvarageAllSensors() {
     double s=0;
     for(double sensorValue:allSensors) {
         s=s+sensorValue;
     }
     return s/allSensors.size();
    }
}
