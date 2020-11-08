package org.fasttrackit;

public class RadioControlledCar extends AutoVehicle {

    private int doorCount;
    private double mileage;
    private Engine engine;

    public RadioControlledCar(Engine ladaEngine) {

    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    @Override
    public double getMileage() {
        return mileage;
    }

    @Override
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public RadioControlledCar(Engine engine, Engine engine1) {
        super(engine);
        this.engine = engine1;
    }
}
