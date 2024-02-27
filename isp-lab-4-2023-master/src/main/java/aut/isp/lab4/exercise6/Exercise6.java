package aut.isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        FishFeeder feeder6=new FishFeeder("AquAquarium","ABC-1234");
        AquariumController aquarium6=new AquariumController(feeder6);
        aquarium6.setCurrentTime(18);
        aquarium6.setFeedingTime(15);
        aquarium6.checkWaterLevel();
        aquarium6.checkTemperature();
        aquarium6.pHMonitoring(7,8,0.2F);
        System.out.println(aquarium6.toString());
    }
}
