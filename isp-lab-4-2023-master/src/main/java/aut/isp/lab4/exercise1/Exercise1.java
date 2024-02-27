package aut.isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        //create an object
        AquariumController aquarium=new AquariumController("a",12,"b");
        aquarium.setCurrentTime(13);
        System.out.println(aquarium.toString());
    }
}
