package isp.lab6.exercise2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Vehicle {
   private String VIN;
   private String licensePlate;
   private String make;
   private String model;
   private int year;
   private Set<Vehicle> vehicles= new HashSet<>();

   public Vehicle(String VIN, String licensePlate, String make, String model, int year) {
      this.VIN = VIN;
      this.licensePlate = licensePlate;
      this.make = make;
      this.model = model;
      this.year = year;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Vehicle vehicle = (Vehicle) o;
      return VIN.equals(vehicle.VIN);
   }

   @Override
   public int hashCode() {
      return Objects.hash(VIN);
   }

   public String getVIN() {
      return VIN;
   }

   public void addVehicle(Vehicle vehicle) {
         vehicles.add(vehicle);
   }
   public void removeVehicle(Vehicle vehicle) {
      if(vehicle.getVIN()==VIN) {
         vehicles.remove(vehicle);
      }
   }
   public void checkVehicle(Vehicle vehicle) {
      if(vehicle.getVIN()==VIN)
         System.out.println("yes");
      else
         System.out.println("no");
   }

   public String getLicensePlate() {
      return licensePlate;
   }

   public String getMake() {
      return make;
   }

   public String getModel() {
      return model;
   }

   public int getYear() {
      return year;
   }

   public void displayVehicle() {
      for(Vehicle vehicle:vehicles)
         System.out.println(getVIN()+" "+getLicensePlate()+" "+getMake()+" "+getModel()+" "+getYear());
   }

}
