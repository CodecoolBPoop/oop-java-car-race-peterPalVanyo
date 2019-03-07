package com.codecool.car_race;

import java.util.ArrayList;

public class Race {

    private static int round = 10;
    private static Weather weather = new Weather();
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static boolean isThereABrokenTruck;


    public void SimulateRace(){
        for(int i = 0; i < round; i++) {
            weather.setRaining();
            isThereABrokenTruck = isThereABrokenTruck();
            for(Vehicle vehicle: vehicles) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }
            printRaceResult();
        }

    }

    public void printRaceResult() {
        System.out.println(weather.isRaining());
        for(Vehicle vehicle: vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() + ": " + vehicle.getName() + " speed: " + vehicle.getActualSpeed() + " moved: " + vehicle.getDistanceTravelled());
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }

    public boolean isThereABrokenTruck() {
        for(Vehicle vehicle: vehicles) {
            if(vehicle instanceof Truck) {
                if(((Truck) vehicle).getBreakdownLeft() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public Weather getWeather() {
        return weather;
    }

    public void addVehicleToVehicles(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
