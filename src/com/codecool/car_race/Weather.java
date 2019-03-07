package com.codecool.car_race;

public class Weather {

    private static Util util = new Util();
    private boolean raining;

    public Weather() {
        this.raining = false;
    }

    public boolean isRaining() {
        return raining;
    }

    public void setRaining() {
        int oddToRaining = util.createRandom(1,100);
        if(oddToRaining < 31) {
            this.raining = true;
        }
    }
}