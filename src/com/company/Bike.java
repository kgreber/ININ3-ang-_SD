package com.company;

public class Bike implements Drivable{
    @Override
    public void drive(Double distance) {
        System.out.println("great trip");
    }

    @Override
    public boolean hasDriver() {
        return true;
    }

    @Override
    public Double getVelocity() {
        return 0.0;
    }
}
