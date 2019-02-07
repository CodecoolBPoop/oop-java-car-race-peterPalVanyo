package com.codecool.car_race;


public class Truck extends Vehicle {

    private int breakdownTurnsLeft;
    Util util = new Util();


    //constructor

    public Truck(String name) {
        super(name, 100, 0);
        this.breakdownTurnsLeft = 0;
    }

    //methods

    @Override
    public void prepareForLap(Race race) {
        System.out.println("this is the truck prepareforlap");    }

    @Override
    public int moveForAnHour() {
        settingBreakdownTurnsLeft();
        if(breakdownTurnsLeft > 0) {
            breakdownTurnsLeft -= 1;
            return 0;
        }
        return this.getSpeed();
    }

    public void settingBreakdownTurnsLeft () {
        if(breakdownTurnsLeft == 0) {
            boolean breakdonwThisLap = util.settingTheBreakdown();
            if(breakdonwThisLap) {
                this.breakdownTurnsLeft = 2;
            }
        }
    }



    //getter and setter

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getDistanceTraveled() {
        return super.getDistanceTraveled();
    }

    @Override
    public void setDistanceTraveled(int distanceTraveled) {
        super.setDistanceTraveled(distanceTraveled);
    }
}
