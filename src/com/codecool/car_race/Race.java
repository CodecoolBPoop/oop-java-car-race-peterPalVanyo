package com.codecool.car_race;

import java.util.ArrayList;

public class Race {

    private int round = 1;
    private ArrayList<Truck> vehicles = new ArrayList<>();

    public void simulateRace() {
        for(int i =1; i<= 10; i++) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + round);
            for(Truck vehicle : this.vehicles) {
                vehicle.distanceTraveled += vehicle.moveForAnHour();
                System.out.println("vehicle: " + vehicle.getName() + "distance: " + vehicle.getDistanceTraveled());
            }
            round++;
        }
    }

    public void printRaceResults() {
        for(Truck vehicle : this.vehicles) {
            System.out.println("The vehicle: " + vehicle.getName() + " has travelled " + vehicle.getDistanceTraveled());
        }
    }

    //for test
    public void testSimulateOneRace(Vehicle vehicle) {
        vehicle.distanceTraveled += vehicle.moveForAnHour();
    }

    //setter and getter

    public int getRound() {
        return round;
    }

    public void setVehicles(ArrayList<Truck> vehicles) {
        this.vehicles = vehicles;
    }
}
