package com.codecool.car_race;


import java.util.ArrayList;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {

        Util util = new Util();
        ArrayList<Truck> trucks = new ArrayList<>();


        //trucks

        ArrayList<String> truckNames = new ArrayList<>();
        truckNames = util.generateListOfNumber(10, 0, 1000);
        for(String currentName : truckNames) {
            Truck truck = new Truck("truck " + currentName);
            trucks.add(truck);
        }

        race.setVehicles(trucks);

        //trucks end






    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {

        Race race = new Race();
        createVehicles(race);




        race.simulateRace();
        race.printRaceResults();
    }
}
