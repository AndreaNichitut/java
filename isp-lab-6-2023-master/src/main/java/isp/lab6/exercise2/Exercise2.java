package isp.lab6.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle("12345","DL989","abc","AB-102",2016);
        Vehicle vehicle2=new Vehicle("5678","KL0987","def","CD-89",2020);
        vehicle1.addVehicle(vehicle1);
        vehicle2.addVehicle(vehicle2);
        vehicle2.checkVehicle(vehicle2);
        vehicle1.displayVehicle();
        vehicle2.displayVehicle();
    }
}
