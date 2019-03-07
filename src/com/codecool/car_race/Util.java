package com.codecool.car_race;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Util {

    Random random = new Random();

    public int createRandom (int bottom, int up) {
        int chosenNumber = ThreadLocalRandom.current().nextInt(bottom, up+1);
        return chosenNumber;
    }
}
