package com.codecool.car_race;


import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);
        race.SimulateRace();

    }

    public static void createVehicles(Race race) {
        for(int i = 0; i< 3; i++) {
            race.addVehicleToVehicles(new Car());
        }
        for(int i = 0; i< 3; i++) {
            race.addVehicleToVehicles(new Truck());
        }
        for(int i = 0; i< 3; i++) {
            race.addVehicleToVehicles(new Motorcycle());
        }
    }

}
