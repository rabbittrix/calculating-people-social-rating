package com.jrsf.data_collector.datacollector;

import java.util.Random;

public class CalculateSocialRating {

    public int CalculateRating(){
        Random seedValue = new Random();
        int seed = seedValue.nextInt(2);
           //System.out.println("SEED " + seed);
        return seed;
    }
}
