package com.codecool.car_race;

public class Car extends Vehicle {

    private static Util util = new Util();

    private static final String[] names = {"Epiphany",
            "Parallel",
            "Blitz",
            "Eos",
            "Evolution",
            "Wolf",
            "Union",
            "Empyrean",
            "Curiosity",
            "Gallop"
    };

    public Car() {
    }

    @Override
    public String generateName() {
        String name = "";
        name += names[util.createRandom(0,9)];
        name += " ";
        name += names[util.createRandom(0,9)];
        return name;
    }

    @Override
    public int generateSpeed() {
        return util.createRandom(80,110);
    }

    @Override
    public void prepareForLap(Race race) {
        if(race.isThereABrokenTruck()) {
            super.setActualSpeed(75);
        } else {
            super.setActualSpeed(super.getSpeed());
        }
    }

}