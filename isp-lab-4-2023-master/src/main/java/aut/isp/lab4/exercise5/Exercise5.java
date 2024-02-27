package aut.isp.lab4.exercise5;

import aut.isp.lab4.exercise3.FishFeeder;

public class Exercise5 {
        public static void main(String[] args) {
            aut.isp.lab4.exercise3.FishFeeder feeder1=new FishFeeder("AquAquarium","ABC-1234",12);
            AquariumController aquarium1=new AquariumController(feeder1);
            aquarium1.setCurrentTime(18);
            aquarium1.setFeedingTime(15);
            aquarium1.checkWaterLevel();
            aquarium1.checkTemperature();
            System.out.println(aquarium1.toString());
        }
}
