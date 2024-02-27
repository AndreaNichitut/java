package aut.isp.lab4.exercise4;

import aut.isp.lab4.exercise3.FishFeeder;

public class Exercise4 {
    public static void main(String[] args) {
        FishFeeder fish = new FishFeeder("a","b",11);
   AquariumController aquarium = new AquariumController(fish,"d","c",11,12,true);
        System.out.println(aquarium.toString());
        aquarium.setCurrentTime(10);
        aquarium.setFeedingTime(13);
        aquarium.controlLights(11);
        System.out.println(aquarium.toString());
        System.out.println(fish.toString());
        fish.feed();
        fish.fillUp();
        System.out.println(fish.toString());
    }
}
