package org.fasttrackit;

public class AutoVehicle extends Vehicle {

   private Engine engine;
   private double mileage;
   private double fuelLevel;

    public AutoVehicle(Engine engine){
        this.engine = engine;
        System.out.println("Custom constructor called");
    }

    public AutoVehicle(Engine engine, String name){
        this(engine);
        setName(name);
    }


    public AutoVehicle(){
        this(new Engine());
    }

    public Engine getEngine() {
        return engine;
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }


}
