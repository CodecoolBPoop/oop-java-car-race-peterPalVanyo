package com.codecool.car_race;

public class Motorcycle extends Vehicle{

    private static int count = 1;
    private static Util util = new Util();

    @Override
    public String generateName() {
        return "Motorcycle" + String.valueOf(count++);
    }

    @Override
    public int generateSpeed() {
        return 100;
    }

    @Override
    public void prepareForLap(Race race) {
        if(race.getWeather().isRaining()) {
            super.setActualSpeed(super.getSpeed() - util.createRandom(5,50));
        } else {
            super.setActualSpeed(super.getSpeed());
        }
    }

}