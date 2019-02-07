package com.codecool.car_race;

public class Vehicle {

    int speed;
    String name;
    int distanceTraveled;


    public void prepareForLap(Race race) {
        System.out.println("this is the vehicle prepareForLap");
    }

    public int moveForAnHour(){
        return 0;
    }

    //constructor

    public Vehicle(String name, int speed, int distanceTraveled) {
        this.name = name;
        this.speed = speed;
        this.distanceTraveled = distanceTraveled;
    }


    //getter and setter

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }
}
