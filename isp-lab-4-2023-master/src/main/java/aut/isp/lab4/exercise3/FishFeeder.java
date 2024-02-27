package aut.isp.lab4.exercise3;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;
    public void feed() {
        this.meals--;
        System.out.println("The fish was fed \n"+"still has "+this.meals);
    }
    public void fillUp() {
        this.meals=14;
        System.out.println("The container is filled");
    }
    public String toString() {
        return this.manufacturer+" "+this.model+" "+this.meals+" ";
    }
    public FishFeeder(String manufacturer,String model,int meals) {
        this.manufacturer=manufacturer;
        this.model=model;
        this.meals=meals;
    }
}
