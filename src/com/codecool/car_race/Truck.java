package com.codecool.car_race;


public class Truck extends Vehicle{
    private int breakdownLeft = 0;
    private static Util util = new Util();


    public void generateBreakdown() {
        int oddToBreakdown = util.createRandom(1,100);
        if(oddToBreakdown < 6 && breakdownLeft == 0) {
            breakdownLeft = 2;
        }
    }

    public void setBreakdownLeft() {
        if(breakdownLeft == 2) {
            breakdownLeft = 1;
        } else if(breakdownLeft == 1) {
            breakdownLeft = 0;
        }
    }


    @Override
    public String generateName() {
        return String.valueOf(util.createRandom(0,1000));
    }

    @Override
    public int generateSpeed() {
        return 100;
    }

    @Override
    public void prepareForLap(Race race) {
        setBreakdownLeft();
        generateBreakdown();
        if(breakdownLeft == 0) {
            super.setActualSpeed(super.getSpeed());
        } else {
            super.setActualSpeed(0);
        }
    }

    public int getBreakdownLeft() {
        return breakdownLeft;
    }
}
