package isp.lab3.exercise3;

public class Exercise3 {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    private static int nrVehicles=0;
    public Exercise3(String model,String type, int speed, char fuelType) {
        this.model=model;
        this.type=type;
        this.speed=speed;
        this.fuelType=fuelType;
        nrVehicles++;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model=model;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type=type;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed=speed;
    }
    public char getFuelType() {
        return this.fuelType;
    }
    public void setFuelType(char fuelType) {
        this.fuelType=fuelType;
    }

    public String toString() {
        return this.model+" ("+this.type+") speed "+this.speed+" fuel type "+this.fuelType;
    }

    public static void displayNrVehicles() {
        System.out.println("Number of Vehicle objects created: " + nrVehicles);
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Exercise3)) {
            return false;
        }
        Exercise3 other = (Exercise3) o;
        return model.equals(other.model) &&
                type.equals(other.type) &&
                speed == other.speed &&
                fuelType == other.fuelType;
    }

    public static void main(String[] args) {
        Exercise3 vehicle1 = new Exercise3("Dacia","Logan",150,'B');
        Exercise3 vehicle2 = new Exercise3("Dacia","Duster",160,'B');
        System.out.println(vehicle1.getModel());
        System.out.println(vehicle1.getType());
        System.out.println(vehicle1.getSpeed());
        System.out.println(vehicle1.getFuelType());
        System.out.println(vehicle2.getModel());
        System.out.println(vehicle2.getType());
        System.out.println(vehicle2.getSpeed());
        System.out.println(vehicle2.getFuelType());
        vehicle1.setModel("Ford");
        vehicle1.setType("Puma");
        vehicle1.setSpeed(180);
        vehicle1.setFuelType('B');
        System.out.println(vehicle1.getModel());
        System.out.println(vehicle1.getType());
        System.out.println(vehicle1.getSpeed());
        System.out.println(vehicle1.getFuelType());

        if (vehicle1.equals(vehicle2)) {
            System.out.println("The two vehicles are equal.");
        } else {
            System.out.println("The two vehicles are not equal.");
        }
    }
}
