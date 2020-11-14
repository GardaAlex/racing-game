package org.fasttrackit;


public class App {
    public static void main( String[] args ) throws Exception {

        Engine daciaEngine = new Engine();
        daciaEngine.setManufacturer("Renault");

        RadioControlledCar dacia = new RadioControlledCar(daciaEngine);
        dacia.setName("Dacia");
        dacia.setColor("Red");
        dacia.setDoorCount(4);
        dacia.setWheelCount(4);
        dacia.setMileage(8.5);

        Engine ladaEngine = new Engine();
        ladaEngine.setManufacturer("Lada");

        RadioControlledCar lada = new RadioControlledCar(ladaEngine);
        lada.setColor("Blue");
        lada.setName("Lada");
        lada.setDoorCount(2);
        lada.setWheelCount(4);
        lada.setMileage(3.2);

        RadioControlledMotorcycle motorcycle = new RadioControlledMotorcycle(new Engine());

        Race race = new Race();
        race.getCompetitors().add(dacia);
        race.getCompetitors().add(lada);

        for (Vehicle vehicle : race.getCompetitors()) {
            if (vehicle != null){
                System.out.println(vehicle.getName());
            }
        }

        race.readVehicleName();
        race.readAccelerationSpeed();
    }
}
