package aut.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
       FishFeeder fish=new FishFeeder("a","b",12);
       AquariumController aquarium=new AquariumController(fish,"c","d",12,11);
        System.out.println(aquarium.toString());
        aquarium.setCurrentTime(10);
        aquarium.setFeedingTime(13);
        System.out.println(aquarium.toString());
        System.out.println(fish.toString());
        fish.feed();
        fish.fillUp();
        System.out.println(fish.toString());
    }
}
