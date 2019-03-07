package com.codecool.car_race;

public abstract class Vehicle {

    private String name;
    private int speed;
    private int actualSpeed;
    private int distanceTravelled;

    public Vehicle() {
        this.name = generateName();
        this.speed = generateSpeed();
    }

    public String generateName() {
        return null;
    }

    public int generateSpeed() {
        return 0;
    }

    public void prepareForLap(Race race) {

    }

    public void moveForAnHour() {
        setDistanceTravelled(getDistanceTravelled() + getActualSpeed());
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
}
