package com.codecool.car_race;

import java.util.ArrayList;
import java.util.Random;

public class Util {



    public int generateANumber (int min, int max) {
        Random random = new Random();
        return random.ints(min, (max+1)).findFirst().getAsInt();
    }

    //for tracks

    public ArrayList<String> generateListOfNumber (int elements, int min, int max) {
        ArrayList<String> listOfNumbers = new ArrayList<>();
        while(listOfNumbers.size() < elements) {
            String currentRandomNumber = String.valueOf(generateANumber(min, max));
            if(!listOfNumbers.contains(currentRandomNumber)) {
                listOfNumbers.add(currentRandomNumber);
            }
        }
        return listOfNumbers;
    }

    public boolean settingTheBreakdown () {
        int breakdownCalc = generateANumber(1,100);
        if(breakdownCalc < 3) {
            return true;
        }
        return false;
    }


}
