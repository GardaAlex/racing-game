package org.fasttrackit;


public class App {
    public static void main( String[] args ){

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

        Race race = new Race(dacia, motorcycle);


    }
}
