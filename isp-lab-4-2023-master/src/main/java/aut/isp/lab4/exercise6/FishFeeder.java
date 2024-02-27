package aut.isp.lab4.exercise6;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;
    //constructors
    public FishFeeder(){
        meals=14;
    }
    public FishFeeder(String manufacturer, String model){
        this.manufacturer=manufacturer;
        this.model=model;
        meals=14;
    }

    //methods
    public void feed(){
        if(meals>0){
            meals--;
            System.out.print("Number of meals left: "+meals+"\n");
        }
        if(meals==0)
            System.out.println("No meals left, please refill");
    }
    public void fillUp(){
        meals=14;
        System.out.print("The meals have been set to 14");
    }

    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }

}
